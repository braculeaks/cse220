public class Array2D {

    public static void printArray(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printArrayRowWise(int[][] arr) {
        //Complete it yourself
    }
    
    public static void printArrayColWise(int[][] arr) {
        // Complete it yourself
    }

    public static void sumRowWise(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
            sum = 0;
        }
    }

    public static void sumColWise(int[][] arr) {
        //Complete it yourself
         }

    public static int[][] swapRows(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < (int) (row / 2); i++) {
            for (int j = 0; j < col; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[row - 1 - i][j];
                arr[row - 1 - i][j] = temp;
            }
        }
        return arr;
    }

    public static int[][] swapCols(int[][] arr) {
        // Complete it yourself
    }
    
    public static int addPrimaryDiagonal(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        if (row != col) {
            System.out.println("Given array is not a square matrix");
            return -1;
        } else {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == j)
                        sum += arr[i][j];
                }
            }
            return sum;
        }
    }
    
    public static int addSecondaryDiagonal(int[][] arr) {
        // Complete it yourself
    }



    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Array2D.printArray(a); //This will print the array
        Array2D.printArrayRowWise(a); //This will print the elements of array row-wise
        Array2D.printArrayColWise(a); // This will print the elements of array col-wise
        Array2D.sumRowWise(a); // This will print the sum of every row of the array
        Array2D.sumColWise(a); // This will print the sum of every col of the array

        int[][] b = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int[][] swappedRowArray = Array2D.swapRows(b); //This will swap the rows of the array
        Array2D.printArray(swappedRowArray); //This will print the row-swapped array

        int[][] c = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int[][] swappedColArray = Array2D.swapCols(c); // This will swap the cols of the array
        Array2D.printArray(swappedColArray); // This will print the col-swapped array

        int[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Sum of elements of primary diagonal is: " + Array2D.addPrimaryDiagonal(d)); //This will print the sum of primary diagonal elements
        System.out.println("Sum of elements of secondary diagonal is: " + Array2D.addSecondaryDiagonal(d)); //This will print the sum of secondary diagonal elements

        //Also complete matrix addition, multiplication. Pseudocode can be found in the course textbook. Solve 2D array problems aswell.

    }
}
