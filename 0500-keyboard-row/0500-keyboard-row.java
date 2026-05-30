class Solution {

    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            int l = words[i].length();
            int t = Row(words[i].charAt(0));
            boolean valid = true;

            for (int j = 1; j < l; j++) {

                int rowcheck = Row(words[i].charAt(j));
                if (rowcheck != t) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }

    public int Row(char c) {
        char x = Character.toUpperCase(c);
        if (x == 'Q' || x == 'W' || x == 'E' || x == 'R' ||
            x == 'T' || x == 'Y' || x == 'U' || x == 'I' ||
            x == 'O' || x == 'P') {
            return 1;
        }
        if (x == 'A' || x == 'S' || x == 'D' || x == 'F' ||
            x == 'G' || x == 'H' || x == 'J' || x == 'K' ||
            x == 'L') {
            return 2;
        }
        return 3;
    }
}