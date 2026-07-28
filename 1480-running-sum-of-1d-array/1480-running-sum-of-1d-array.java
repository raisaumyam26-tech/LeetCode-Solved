class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length, sum=0;
        for(int i=1;i<l;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}