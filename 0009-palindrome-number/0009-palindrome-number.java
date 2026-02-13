class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        

        while(x>0){
            int lastdig = x % 10;
            x /= 10;
            rev = (rev * 10) + lastdig;

        }
        if(rev == org){
            return true;
        }
        return false;
        
    }
}