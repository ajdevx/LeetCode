// Last updated: 15/09/2025, 19:35:28
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0;
        int column = matrix[0].length-1;
        while(column>=0 && row<=matrix.length-1){
            int el = matrix[row][column];
            if( el == target) return true;
            else if(el<target) row++;
            else column--;
        }
        return false;
    }
}