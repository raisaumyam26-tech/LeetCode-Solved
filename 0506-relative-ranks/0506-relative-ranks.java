class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];

        int rank = 1;
        for (int i = 0; i < score.length; i++) {

            int max = -1;
            int t = -1;
            for (int j = 0; j < score.length; j++) {

                if (score[j] > max) {
                    max = score[j];
                    t = j;
                }
            }
            if (rank == 1) {
                ans[t] = "Gold Medal";
            }
            else if (rank == 2) {
                ans[t] = "Silver Medal";
            }
            else if (rank == 3) {
                ans[t] = "Bronze Medal";
            }
            else {
                ans[t] = Integer.toString(rank);
            }
            score[t] = -1;
            rank++;
        }

        return ans;
    }
}