class Solution {
    public int pivotIndex(int[] nums) {

        int l = nums.length;
        int[] leftsum = new int[l];
        int sum = 0;
        for (int i = 0; i < l; i++) {
            leftsum[i] = sum;
            sum += nums[i];
        }
        int total = sum;
        for (int i = 0; i < l; i++) {

            int rightSum = total - leftsum[i] - nums[i];
            if (leftsum[i] == rightSum) {
                return i;
            }
        }

        return -1;
    }
}