class Solution {
    public int trap(int[] height) {
      
      int n=height.length;
     int lm[]=new int[n];
     int rm[]=new int[n];
     int max=height[0];
     int max1=height[n-1];
     for(int i=0, j=n-1; i<n; i++, j--){
              max=Math.max(height[i],max);
              max1=Math.max(height[j], max1);
              lm[i]=max;
              rm[j]=max1;

     }
     int sum=0;
     for(int i=0; i<n; i++){
        sum+=Math.min(lm[i], rm[i])-height[i];
     }
     return sum;
    }
}