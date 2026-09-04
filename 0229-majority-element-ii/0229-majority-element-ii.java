import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) > nums.length / 3) {
                arr1.add(num);
            }
        }
        return arr1;
    }
}