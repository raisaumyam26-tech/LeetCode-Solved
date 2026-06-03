class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        long ans=Long.MAX_VALUE;
        long bestLand=Long.MAX_VALUE;
        long bestWater=Long.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++) {
            bestLand=Math.min(bestLand,(long)landStartTime[i]+landDuration[i]);
        }
        for(int i = 0; i < waterStartTime.length; i++) {
            bestWater=Math.min(bestWater,(long)waterStartTime[i]+waterDuration[i]);
        }
        for(int i = 0; i < waterStartTime.length; i++) {
            long finish=Math.max(bestLand,waterStartTime[i])+waterDuration[i];
            ans = Math.min(ans, finish);
        }
        for(int i = 0; i < landStartTime.length; i++) {
            long finish = Math.max(bestWater,landStartTime[i])+landDuration[i];

            ans = Math.min(ans, finish);
        }
        return (int)ans;
    }
}