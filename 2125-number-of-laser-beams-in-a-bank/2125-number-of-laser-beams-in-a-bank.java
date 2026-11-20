class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int first = nums(bank[0]);
        for(int i = 1; i < bank.length; i++){
            if(nums(bank[i]) != 0){
                ans += first * nums(bank[i]);
                first = nums(bank[i]);
            }
        }
        return ans;
    }
    int nums(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++)
            res += (s.charAt(i) - '0');
        return res;
    }
}