class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max=0,perimeter=0;
        for(int i=nums.length-1; i>1; i--){
            if((nums[i-1]+nums[i-2])>nums[i]){
                perimeter=nums[i]+nums[i-1]+nums[i-2];
               max=Math.max(perimeter,max);
            }
        }
            return max;
    }
}