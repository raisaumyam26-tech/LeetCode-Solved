class Solution {
    public int minElement(int[] nums) {
        int k=0;
        for(int i : nums){
            int sum=0;
            while(i!=0){
                sum+=i%10;
                i=i/10;
            }
            nums[k++]=sum;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}