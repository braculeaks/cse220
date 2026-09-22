class AssgnTask2
{
    public static void zeroOut(Integer[][] mat2D) {
        for (int r = 0; r < mat2D.length; r++) {
            for (int c = 0; c < mat2D[r].length; c++) {
                mat2D[r][c] = 0;
            }
        }
    }
    public static Integer[][] compressMatrix(Integer[][] matrix) {
        int n_rows = matrix.length;         // given: always even
        int n_cols = matrix[0].length;      // given: always even

        Integer[][] out = new Integer[n_rows/2][n_cols/2];
            zeroOut(out);

        for (int r = 0; r < n_rows; r++) {
            for (int c = 0; c < n_cols; c++) {
                out[r/2][c/2] += matrix[r][c];
            }
        }

        return out;
    }


    public static void main(String[] args) {
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };

        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix(matrix);
        Arr.print2D(returnedArray);
    }
}