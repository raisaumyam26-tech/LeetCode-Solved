class Solution {
    public int countKDifference(int[] nums, int k) {
        int res=0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int temp=Math.abs(nums[i]-nums[j]);
                if(k==temp){
                    res++;
                }
            }
        }
            return res;
    }
}