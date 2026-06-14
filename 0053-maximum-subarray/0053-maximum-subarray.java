public class Solution {
    public int maxSubArray(int[] nums) {
        
        int mS = nums[0];
        int cS = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (cS < 0) {
                cS = 0;
            }
            
            cS += nums[i];
            mS = Math.max(mS, cS);
        }
        
        return mS;
    }
}