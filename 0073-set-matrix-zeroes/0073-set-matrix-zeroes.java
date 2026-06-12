class Solution {
    public void setZeroes(int[][] matrix) {
        int l = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[l];
        int[] column = new int[m];

        for(int i = 0; i < l; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = -1;
                    column[j] = -1;
                   }
             }
        }

        for(int i = 0; i < l; i++) {
            for(int j = 0; j < m; j++) {
                if(row[i] == -1 || column[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}