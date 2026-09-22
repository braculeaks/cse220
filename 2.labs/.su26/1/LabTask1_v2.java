class LabTask1_v2 
{
    public static void walkZigzag(Integer[][] mat2D){
        int n_rows = mat2D.length;
        int n_cols = mat2D[0].length;

        for (int c = 0; c < n_cols; c++) 
        {
            if (c % 2 == 0) {
                int r = 0;
                while (r < n_rows) {
                    System.out.print(mat2D[r][c] + " ");
                    r += 2;
                }
            }
            else {
                int r = 0;
                if (n_rows % 2 == 0) r = n_rows-1;
                else                 r = n_rows-2;

                while (r > 0) {
                    System.out.print(mat2D[r][c] + " ");
                    r -= 2;
                }
            }
            System.out.println("");
        }
    }

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
