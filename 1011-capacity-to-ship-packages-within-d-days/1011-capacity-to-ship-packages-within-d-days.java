class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for (int x : weights) {
            low=Math.max(low, x);
            high+=x;
        }
        while (low < high) {
            int mid = (low+high)/2;
            int day = 1;
            int sum = 0;
            for (int x : weights) {
                if (sum+x>mid) {
                    day++;
                    sum=0;
                }

                sum+=x;
            }

            if (day<=days)
                high=mid;
            else
                low=mid+1;
        }

        return low;
    }
}