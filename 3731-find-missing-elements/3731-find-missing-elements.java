class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            arr.add(nums[i]);
        }
        int length=nums[nums.length-1]-nums[0];
        int k=nums[0];
        while(length>0){
            length--;
            if(!arr.contains(k++)){
              ans.add(k-1);
            }
        }
        return ans;
        
        
    }
}