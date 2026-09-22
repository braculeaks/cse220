// Lab Task 02: Decryption Process

class LabTask2_v2
{
    public static Integer[] decryptMatrix(Integer[][] mat2D ){
        int n_rows = mat2D.length;
        int n_cols = mat2D[0].length;

        Integer[] colSums = new Integer[n_cols];
        Integer[] out     = new Integer[n_cols-1];

        for (int c = 0; c < n_cols; c++)            // Gen. Column Sums
        {
            colSums[c] = 0;
            for (int r = 0; r < n_rows; r++) {
                colSums[c] += mat2D[r][c];
            }
        }

        int last_sum = colSums[0];
        for (int i = 1; i < colSums.length; i++) {  // Adjacent Column Differences
            int sum  = colSums[i];
            int diff = sum - last_sum;
            last_sum = sum;
            out[i-1] = diff;                        // out[k] = colSums[k+1] - colSums[k]
        }

        return out;
    }


    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };

        System.out.println("Given Matrix: ");
            Arr.print2D(matrix);

        System.out.println("\nExpected Output:\n[ -13 1 ]");

        Integer[] returned_val_1 = decryptMatrix(matrix);

        System.out.print("\nYour Output:\n");
            Arr.print(returned_val_1);
    }
}
