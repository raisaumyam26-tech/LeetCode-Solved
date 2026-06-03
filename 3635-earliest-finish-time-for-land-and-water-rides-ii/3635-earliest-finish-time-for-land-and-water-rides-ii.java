class Solution {

    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int ans = Integer.MAX_VALUE;
        int bestLand = Integer.MAX_VALUE;
        int bestWater = Integer.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++) {
            bestLand = Math.min(bestLand,
                    landStartTime[i] + landDuration[i]);
        }
        for(int i = 0; i < waterStartTime.length; i++) {
            bestWater = Math.min(bestWater, waterStartTime[i] + waterDuration[i]);
        }
        for(int i = 0; i < waterStartTime.length; i++) {
            int finish = Math.max(bestLand, waterStartTime[i]) + waterDuration[i];

            ans = Math.min(ans, finish);
        }

        for(int i = 0; i < landStartTime.length; i++) {
             int finish=Math.max(bestWater, landStartTime[i])+landDuration[i];
              ans = Math.min(ans, finish);
             }
        return ans;
    }
}