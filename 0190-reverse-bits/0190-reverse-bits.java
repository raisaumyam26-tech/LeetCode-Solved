class Solution {
    public int reverseBits(int n) {
        int arr[]=new int[32];
        int i=31;
        while(n!=0){
            int r=n%2;
            arr[i--]=r;
            n=n/2;
        }
        int ans=0, k=0;
        for(int j=0; j<32; j++){
           ans+=((int)Math.pow(2, k++))*arr[j];
        }
        return ans;
    }
}