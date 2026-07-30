import java.util.Arrays;

class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {

        Arrays.sort(buses);
        Arrays.sort(passengers);

        int j = 0;
        int cnt = 0;

        for (int i = 0; i < buses.length; i++) {
            cnt = 0;

            while (j < passengers.length &&
                   passengers[j] <= buses[i] &&
                   cnt < capacity) {
                j++;
                cnt++;
            }
        }

        int ans;

        if (cnt < capacity) {
            ans = buses[buses.length - 1];
        }
        else {
            ans = passengers[j - 1];
        }
        int k = passengers.length - 1;
        while (k >= 0) {
            if (passengers[k] == ans) {
                ans--;
                k--;
            } else if (passengers[k] > ans) {
                k--;
            } else {
                break;
            }
        }
        return ans;
    }
}