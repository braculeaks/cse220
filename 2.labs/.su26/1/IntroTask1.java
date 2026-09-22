public class IntroTask1 
{
    public static void REY_print_RowWise(Object[][] mat2D) {
        int n_rows = mat2D.length;
        int n_cols = mat2D[0].length;

        for (int r = 0; r < n_rows; r++) {
            for (int c = 0; c < n_cols; c++) {
                System.out.print(mat2D[r][c] + " ");
            }
            System.out.println("");
        }
    }

    //     (2x4) mul (4x3) works
    // ==> (2x4) = Left-Right Lomba   
    // ==> (4x3) = Top-Bottom Lomba ==> 4 rows, 3 cols

    //      4x3
    // 4 rows, 3 cols
    // m rows, n cols
    // m     , n
    // i     , j
    // y rows, x cols
    // r     , c

    public static void main(String[] args){
        Integer[][] floor1 = {
            {3 , 8 , 4 , 6 , 1},
            {7 , 2 , 1 , 9 , 3},
            {9 , 0 , 7 , 5 , 8},
            {2 , 1 , 3 , 4 , 0},
            {1 , 4 , 2 , 8 , 6}
        };
        Integer[][] floor2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        REY_print_RowWise(floor2);
    }
}
