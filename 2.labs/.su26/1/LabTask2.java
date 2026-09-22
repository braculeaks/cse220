// Lab Task 02: Decryption Process

class LabTask2 
{
    public static Integer[][] REY_TransposeMat2D_1(Integer[][] mat2D) {
        int n_rows = mat2D.length;
        int n_cols = mat2D[0].length;

        Integer[][] out = new Integer[n_cols][n_rows];

        for (int i = 0; i < n_rows; i++) {
            for (int j = 0; j < n_cols; j++) {
                out[j][i] = mat2D[i][j]; 
            }
        }

        return out;
    }

    public static Integer[] decryptMatrix(Integer[][] mat2D ){
        int n_rows = mat2D.length;
        int n_cols = mat2D[0].length;

        Integer[] out = new Integer[n_cols-1];

        Integer[][] tmp = REY_TransposeMat2D_1(mat2D);
            n_rows = tmp.length;
            n_cols = tmp[0].length;

        int last_sum = 0;
        Integer[] row = tmp[0];
            for (int x : row) {
                last_sum += x;
            }

        for (int i = 1; i < n_rows; i++) {
            row = tmp[i];

            int sum = 0;
            for (int x : row) {
                sum += x;
            }

            int diff = sum - last_sum;
            last_sum = sum;
            out[i-1] = diff;
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
