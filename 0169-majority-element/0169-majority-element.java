class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int maxCount = 0;
        int most = -1; 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();   
                most = entry.getKey(); 
            }
        }
        return most;
    }
}