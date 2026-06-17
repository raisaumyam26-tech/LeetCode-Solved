class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase=true;
        boolean decrease=true;
        for(int i=1; i<nums.length; i++){
            if(nums[i]-nums[i-1]>0){
                decrease=false;
            }
            if(nums[i]-nums[i-1]<0){
                increase=false;
            }
        }
        return increase || decrease;
    }
}