class Solution {
    public int trap(int[] height) {

        int lm[] = new int[height.length];
        int rm[] = new int[height.length];

        int max = height[0];
        for(int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            lm[i] = max;
        }
        int max1 = height[height.length - 1];
        for(int j = height.length - 1; j >= 0; j--) {
            max1 = Math.max(max1, height[j]);
            rm[j] = max1;
        }
        int sum = 0;
        for(int i = 0; i < height.length; i++) {
            sum += Math.min(lm[i], rm[i]) - height[i];
        }
        return sum;
    }
}