class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if ((r * c) != (mat.length * mat[0].length)) return mat;
        int[][] mat1 = new int[r][c];
        int k = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat1[k / c][k % c] = mat[i][j];
                k++;
            }
        }
        return mat1;
    }
}