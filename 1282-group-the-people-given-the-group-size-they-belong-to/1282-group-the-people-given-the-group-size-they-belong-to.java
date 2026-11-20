class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> mat = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            map.putIfAbsent(size, new ArrayList<>());
            List<Integer> currentGroup = map.get(size);
            currentGroup.add(i);
            
            if (currentGroup.size() == size) {
                mat.add(currentGroup);
                map.remove(size); 
            }
        }
        return mat;
    }
}