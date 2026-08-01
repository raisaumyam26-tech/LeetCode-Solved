class Solution {
    public int countValidPrefixes(String s) {
        int ans=0, c1=0, c2=0;
        for(int ch : s.toCharArray()){
            if(ch == '0'){ c1++; }
            else { c2++; }
            if(Math.abs(c1-c2)<2){
                ans++;
            }
        }
        return ans;
    }
}