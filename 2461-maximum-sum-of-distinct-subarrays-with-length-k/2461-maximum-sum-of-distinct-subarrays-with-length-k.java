class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;

        Set<Integer> set = new HashSet<>();

        int l = 0;
        for(int i=0; i<nums.length; i++){
            while(set.contains(nums[i])){
                set.remove(nums[l]);
                currentSum -= nums[l];
                l++;
            }

            set.add(nums[i]);
            currentSum += nums[i];

            if(i-l+1 > k){
                set.remove(nums[l]);
                currentSum -= nums[l];
                l++;
            }

            if(i-l+1 == k){
                maxSum = Math.max(maxSum , currentSum);
            }
        }
        return maxSum;
  }
}