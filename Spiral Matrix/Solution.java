class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arrayList = new ArrayList<>();

        // If the matrix is empty, return it
        if (matrix.length == 0) {
            return arrayList;
        }

        
        int rowStart = 0;
        w
        int rowEnd = matrix.length-1;
        
        int columnStart = 0;
        
        int columnEnd = matrix[0].length - 1;

      
        while (rowStart <= rowEnd && columnStart <= columnEnd) {

            for (int currentIndex = columnStart; currentIndex <= columnEnd; currentIndex++) {

                arrayList.add(matrix[rowStart][currentIndex]);
            }

            rowStart++;

            for (int currentIndex = rowStart; currentIndex <= rowEnd; currentIndex++) {

                arrayList.add(matrix[currentIndex][columnEnd]);
            }

            columnEnd--;
            
            if (rowStart <= rowEnd) {
            
                for (int currentIndex = columnEnd; currentIndex >= columnStart; currentIndex --) {
            
                    arrayList.add(matrix[rowEnd][currentIndex]);
                }
            }
            
            
            rowEnd--;

            
            if (columnStart <= columnEnd) {
                
                for (int currentIndex = rowEnd; currentIndex >= rowStart; currentIndex --) {
                   
                    arrayList.add(matrix[currentIndex][columnStart]);
                }
            }
            
            columnStart++;
        }

        
        return arrayList;
    }
}
    
