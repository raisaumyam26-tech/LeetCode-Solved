class Solution {
    public String destCity(List<List<String>> paths) {

        HashSet<String> source = new HashSet<>();

        for(int i = 0; i <paths.size(); i++) {
            List<String> path = paths.get(i);
            source.add(path.get(0));
        }

        for(int i = 0; i < paths.size(); i++) {
            List<String> path = paths.get(i);
            if(!source.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}