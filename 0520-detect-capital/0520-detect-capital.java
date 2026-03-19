class Solution {
    public boolean detectCapitalUse(String word) {
        if(allCapital(word) || allSmall(word) || allSmall(word.substring(1))){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean allCapital(String word){
        for(char ch : word.toCharArray()){
            if(ch < 'A' || ch > 'Z'){
                return false;
            }
        }
        return true;
    }

     public boolean allSmall(String word){
        for(char ch : word.toCharArray()){
            if(ch < 'a' || ch > 'z'){
                return false;
            }
        }
        return true;
    }
}