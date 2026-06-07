class Solution {
    public String convertToBase7(int num) {
        boolean check=num<0;
        String ans="";
        if(num==0) return "0";
        num=Math.abs(num);
        while(num!=0){
            int rem=num%7;
            ans=rem+ans;
            num/=7;
        }
        return check? "-"+ans : ans;
    }
}