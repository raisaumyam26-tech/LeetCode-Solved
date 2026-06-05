class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int z=m+n;
        int arr[]=new int[z];
        int k=0;
        for(int i=0; i<z ;i++){
            if (i<m){
                arr[i]=nums1[i];
            }
            else if (i>=m && i<z){
                 arr[i]=nums2[k];
                 k++;
            }
        }
        Arrays.sort(arr);
        double l=0;
        if(z%2==0)
         l=(arr[z/2]+arr[(z/2)-1])/2.0;
        else 
         l=arr[z/2];
        return l;
    }
}