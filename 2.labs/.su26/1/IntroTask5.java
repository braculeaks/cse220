public class IntroTask5 
{
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
        floor2 = REY_TransposeMat2D(floor2);
        Arr.print2D(floor2);
    }
}
