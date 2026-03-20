class Solution {

    public int numSub(String s) {
        long MOD = 1_000_000_007;
        long res = 0;
        long cnt = 0;

        for(char ch : s.toCharArray()){
            if(ch == '1'){
                cnt++;
                res = (res + cnt) % MOD;
            }else{
                // res += (cnt * (cnt +1)/2)% MOD;
                cnt =0;
            }
        }
        // res += (cnt * (cnt + 1)/2) % MOD;
        return (int) res;
        
    }
}