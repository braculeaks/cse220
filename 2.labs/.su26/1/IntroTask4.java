public class IntroTask4 {
    public static void REY_task4(Integer[][] mat2D) {
        int sum1 = 0;
        int sum2 = 0;
        int n_rows = mat2D.length;

        for (int i = 0; i > n_rows; i++) {
            sum1 += mat2D[i][i];
            sum2 += mat2D[i][n_rows-1-i];
        }

        System.out.println(Math.abs(sum1-sum2));
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
        
        REY_task4(floor2);
    }
}
