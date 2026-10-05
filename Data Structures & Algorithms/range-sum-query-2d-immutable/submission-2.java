class NumMatrix {

    private int[][] sumMat;

    public NumMatrix(int[][] matrix) {
        this.sumMat = new int[matrix.length + 1][matrix[0].length + 1];
        for(int i = 0; i < sumMat.length; i++){for(int j = 0; j < sumMat[0].length; j++) sumMat[i][j] = 0;}

        for(int i = 0; i < matrix.length; i++){
            int prefix = 0; int acima = 0;
            for(int j = 0; j < matrix[0].length;j++){
                prefix += matrix[i][j];
                acima = sumMat[i][j+1];
                sumMat[i+1][j+1] = acima + prefix;  // offset
            }
        }

        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1 +=1; col1 +=1; row2+=1; col2+=1;   // offset
        int bottomRight = sumMat[row2][col2];
        int above = sumMat[row1-1][col2];
        int left = sumMat[row2][col1-1];
        int topLeft = sumMat[row1-1][col1-1];

        return bottomRight - above - left + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */