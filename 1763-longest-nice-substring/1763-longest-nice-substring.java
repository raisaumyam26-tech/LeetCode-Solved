class Solution {
    public String longestNiceSubstring(String s) {
        String ans="";
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<=s.length(); j++){
                String sub=s.substring(i,j);
                if(Nice(sub) && sub.length()>ans.length()){
                    ans=sub;
                }
            }
        }
        return ans;
    }
    public boolean Nice(String t){
        if(t.length()<2) return false;
        for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            if(t.indexOf(Character.toLowerCase(ch))==-1 || t.indexOf(Character.toUpperCase(ch))==-1){
                return false;
            }
        }
        return true;
    }
}