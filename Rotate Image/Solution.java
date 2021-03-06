class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        
        for(int i =0;i< rows;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i =0;i<rows;i++){
            
            int temp;
            int left = 0;
            int right = rows-1;
            while(left<=right){
                temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
            
        }
        
    }
}
