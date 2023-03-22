class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        
        int startRow = 0, endRow = n-1;
        int startCol = 0, endCol = n-1;
        
        int counter = 1;
        
        while(startRow <= endRow && startCol <= endCol)
        {
            for (int i = startCol; i <= endCol; i++)
            {
                result[startRow][i] = counter++;
            }
            startRow++;
            
            for(int i = startRow; i <= endRow; i++)
            {
                result[i][endCol] = counter++;
            }
            endCol--;
            
            if(startRow <= endRow) {
            for(int i = endCol; i>=startCol; i--)
            {
                result[endRow][i] = counter++;
            }
            }
            endRow--;
            
            if(startCol <= endCol) {
            for(int i = endRow; i>=startRow; i--)
            {
                result[i][startCol] = counter++;
            }
            }
            startCol++;
        }
        return result;
    }
}