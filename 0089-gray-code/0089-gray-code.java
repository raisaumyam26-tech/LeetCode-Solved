class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        int length=1<<n;
        for(int i=0; i<length; i++){
            int grey= i^(i>>1);
            arr.add(grey);
        }
        return arr;
    }
}