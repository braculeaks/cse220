// Lab Task 01: Zigzag Walk

class LabTask1 
{
    public static Integer[][] REY_Duplicate(Integer[][] mat2D) {
        int n_rows = mat2D.length;
        int n_cols = mat2D[0].length;

        Integer[][] tmod = new Integer[n_rows][n_cols];

        for (int i = 0; i < n_rows; i++) {          
            for (int j = 0; j < n_cols; j++) {
                tmod[i][j] = mat2D[i][j];
            }
        }

        return tmod;
    }

    public static Integer[][] REY_TransposeMat2D(Integer[][] mat2D) {
        int n_rows = mat2D.length;
        int n_cols = mat2D[0].length;

        Integer[][] out = new Integer[n_cols][n_rows];

        for (int r = 0; r < n_rows; r++) {
            for (int c = 0; c < n_cols; c++) {
                out[c][r] = mat2D[r][c]; 
            }
        }

        return out;
    }

    public static Integer[] REY_ReverseRow(Integer[] row) {
        int n = row.length;

        Integer[] out = new Integer[n];
        
        for (int j = 0; j < n; j++) {
            out[j] = row[n-1-j];
        }

        return out;
    }

    public static void walkZigzag(Integer[][] mat2D){
        int n_rows = mat2D.length;
        int n_cols = mat2D[0].length;


        Integer[][] transposed = REY_TransposeMat2D(mat2D); 
            n_rows = transposed.length;
            n_cols = transposed[0].length;
        Integer[][] tmod = REY_Duplicate(transposed);

        for (int i = 0; i < n_rows; i++) {          // Left-Right-Reverse, row-1, row-3, row-5, so on
            if (i % 2 == 0)
                continue;

            tmod[i] = REY_ReverseRow(tmod[i]);
        }


        // System.out.println("Transposed + Reversed: ");
        // Arr.print2D(tmod);

        
        for (int i = 0; i < n_rows; i++) {
            for (int j = 0; j < n_cols; j++) {
                if (((i*n_cols)+j) % 2 == 0) {
                    System.out.print(tmod[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }


    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] floor1 = {
            {3 , 8 , 4 , 6 , 1},
            {7 , 2 , 1 , 9 , 3},
            {9 , 0 , 7 , 5 , 8},
            {2 , 1 , 3 , 4 , 0},
            {1 , 4 , 2 , 8 , 6}
        };

        System.out.println("Given Matrix: ");
        Arr.print2D(floor1);
        System.out.println("\nExpected Output:");
        System.out.print("3 9 1\n1 2\n4 7 2\n4 9\n1 8 6\n");
        System.out.print("\nYour Output:\n");
        walkZigzag( floor1 );

        System.out.print("\n======================\n");

        Integer[][] floor2 = {
            {3 , 8 , 4 , 6 , 1},
            {7 , 2 , 1 , 9 , 3},
            {9 , 0 , 7 , 5 , 8},
            {2 , 1 , 3 , 4 , 0},
        };
        System.out.println("\nGiven Matrix: ");
        Arr.print2D(floor2);
        System.out.println("\nExpected Output:");
        System.out.print("3 9\n1 2\n4 7\n4 9\n1 8\n");
        System.out.print("\nYour Output:\n");
        walkZigzag( floor2 );

    }
}
