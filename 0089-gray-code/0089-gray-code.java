class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        int length=1<<n;
        for(int i=0; i<length; i++){ 
            arr.add(i^(i>>1));
        }
        return arr;
    }
}