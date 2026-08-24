class Solution {
    public void rotate(int[] nums, int k) {
        int ans[]=new int[nums.length];
        int l=nums.length;
        int a=0;
        k=k%l;
        for(int i=l-k; i<l; i++){
             ans[a++]=nums[i];
        }
        for(int i=0; i<l-k; i++){
             ans[a++]=nums[i];
        }
        for(int i=0; i<l; i++){
            nums[i]=ans[i];
        }
    }
}