class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<((int)Math.pow(2,n)); i++){
            int grey= i^(i>>1);
            arr.add(grey);
        }
        return arr;
    }
}