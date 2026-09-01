class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[]=new int[256];
        Arrays.fill(arr,-1);
        int i=0, m=0, st=0;
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(arr[c]>=i){
                i=arr[c]+1;
            }
            arr[c]=j;
            int l=j-i+1;
            if(l>m){
                m=l;
                st=i;
            }
        }
        return m;
    }
}