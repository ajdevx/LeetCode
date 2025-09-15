// Last updated: 15/09/2025, 19:35:30
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
            //top
            for(int i=sc;i<=ec;i++){
                list.add(matrix[sr][i]);
            }
            //right
            for(int i=sr+1;i<=er;i++){
                list.add(matrix[i][ec]);
            }
            //bottom
            for(int i=ec-1;i>=sc;i--){
                if(sr==er){
                    break;
                }
                list.add(matrix[er][i]);
            }
            //left
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                list.add(matrix[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        return list;

    }
}