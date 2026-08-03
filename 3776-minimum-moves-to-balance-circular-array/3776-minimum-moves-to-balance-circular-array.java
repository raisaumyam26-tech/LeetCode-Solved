class Solution {
    public long minMoves(int[] balance) {

        int n = balance.length;
        long sum = 0;
        int pointer = -1;

        for(int i = 0; i < n; i++) {
            sum += balance[i];

            if(balance[i] < 0)
                pointer = i;
        }

        if(pointer == -1)
            return 0;

        if(sum < 0)
            return -1;

        long req = -balance[pointer];
        long ans = 0;

        for(int d = 1; req > 0; d++) {

            int left = (pointer - d + n) % n;

            long take = Math.min(req, balance[left]);
            ans += take * d;
            req -= take;

            if(req == 0)
                break;

            int right = (pointer + d) % n;

            take = Math.min(req, balance[right]);
            ans += take * d;
            req -= take;
        }

        return ans;
    }
}