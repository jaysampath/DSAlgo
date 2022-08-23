class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int bottom = m-1;
        
        //Binary Search through first column and find the row where the target could be.
        while(top<=bottom){
            int mid = (top+bottom)/2;
            if(matrix[mid][0]==target)
                return true;
            else if(matrix[mid][0]>target)
                bottom = mid-1;
            else
                top = mid+1;
        }
        
       
        int targetRow = top-1;
        //not present case
         if(targetRow<0 || targetRow>m-1)
            return false;
        
        //Binary Search through the targetRow
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(matrix[targetRow][mid]==target)
                return true;
            else if(matrix[targetRow][mid]>target)
                right = mid-1;
            else
                left = mid+1;
        }
        
        return false;
        
    }
}
