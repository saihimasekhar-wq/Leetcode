class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int first = bank[0].replace("0","").length();
        for(int i = 1; i < bank.length; i++){
            if(bank[i].replace("0","").length() != 0){
                ans += first * bank[i].replace("0","").length();
                first = bank[i].replace("0","").length();
            }
        }
        return ans;
    }
}