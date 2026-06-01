class Solution {

    public int minimumCost(int[] cost) {

        Arrays.sort(cost);
        int price = 0;

        for (int i = cost.length - 1; i >= 0; i -= 3) {
            price += cost[i];
            if (i - 1 >= 0) {
                price += cost[i - 1];
            }
        }
        return price;
    }
}