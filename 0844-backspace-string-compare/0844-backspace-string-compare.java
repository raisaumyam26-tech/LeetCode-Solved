class Solution {
    public boolean backspaceCompare(String s, String t) {

        while (s.contains("#")) {
            int index = s.indexOf("#");
            if (index>0) {
                s = s.substring(0, index - 1) + s.substring(index + 1);
            } else {
                s = s.substring(index + 1);
            }
        }

        while (t.contains("#")) {
            int index=t.indexOf("#");

            if (index>0) {
                t = t.substring(0, index - 1) + t.substring(index + 1);
            } else {
                t = t.substring(index + 1);
            }
        }
        return s.equals(t);
    }
}