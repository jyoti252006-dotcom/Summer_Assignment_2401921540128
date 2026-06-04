1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int m=mat.length;
4        int n=mat[0].length;
5        if(m*n !=r*c){
6            return mat;
7        }
8        int res[][]=new int[r][c];
9        for(int i=0;i<r*c;i++){
10            res[i/c][i%c] = mat[i/n][i%n];
11        }
12        return res;
13    }
14}