// Last updated: 15/09/2025, 19:34:15
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            sum = sum +  mat[i][i];
            if(i!= mat.length-1-i){
                sum = sum + mat[i][mat.length-1-i];
            }
        }
        return sum;
    }
}