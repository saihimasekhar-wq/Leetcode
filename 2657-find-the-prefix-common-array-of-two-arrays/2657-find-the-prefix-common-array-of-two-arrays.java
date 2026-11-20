class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] arr = new int[n];
        HashMap<Integer,Integer> mapA = new HashMap<>(); 
        HashMap<Integer,Integer> mapB = new HashMap<>(); 
        for(int i = 0; i < n; i++){
            int count = 0;
            mapA.put(A[i],i);
            mapB.put(B[i],i);
            if(A[i] == B[i]){
                count++;
                if(i == 0){
                    arr[i] += count;
                    continue;
                }
                arr[i] = arr[i-1] + count;
            }
            else{
                if(i == 0){
                    arr[i] += count;
                    continue;
                }
                if(mapA.containsKey(B[i]) && mapA.get(B[i]) < i){
                    count++;
                }
                if(mapB.containsKey(A[i]) && mapB.get(A[i]) < i){
                    count++;
                }
                arr[i] = arr[i - 1] + count;
            }
        }
        return arr;
    }
}