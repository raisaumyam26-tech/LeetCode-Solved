class Solution {
    public boolean isAcronym(List<String> words, String s) {
    
        if(words.size()!=s.length()){
            return false;
        }
       return helper(words, s, 0);

    }
    public boolean helper(List<String> words, String s, int a){
        if(a==words.size()){
            return true;
        }
        if(words.get(a).charAt(0) != s.charAt(a)){
            return false;
        }
       return helper(words, s, a+1);
    }
    
}