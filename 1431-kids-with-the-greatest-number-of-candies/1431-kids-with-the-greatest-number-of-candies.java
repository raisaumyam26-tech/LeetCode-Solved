class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0, l=candies.length;
        for(int i=0; i<l; i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
          List<Boolean> ans=new ArrayList<>();

            for(int i=0; i<l; i++){
                if(candies[i]+extraCandies>=max){
                   ans.add(true);
                }else{
                    ans.add(false);
                }
            }
            return ans;
        }
    }
