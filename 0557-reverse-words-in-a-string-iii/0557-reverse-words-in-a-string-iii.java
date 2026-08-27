class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
       String arr[]=s.trim().split("\\s+");
       for(int i=0;i<arr.length;i++){
        String k=arr[i];
        for(int j=k.length()-1;j>=0;j--){
            ans.append(k.charAt(j));
        }
        if(i!=arr.length-1) ans.append(" ");
       } 
       return ans.toString();
    }
}