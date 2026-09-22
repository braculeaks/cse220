public class AssgnTask1_v2 
{
    public static void REY_reverse(Object[] arr, int l, int r) {
        // l = start  (inclusive)
        // r = end    (inclusive)
        if (l > r) {System.out.println("Error Code 1"); return;}

        int count = r-l+1;
        int mid = count / 2;        
            // 6 elems ==> 3 swaps
            // 7 elems ==> 3 swaps

        for (int i = 0; i < mid; i++) 
        {
            Object tmp  = arr[l+i];
            arr   [l+i] = arr[r-i];
            arr   [r-i] = tmp;
        }
    }

    public static Integer rowRotation(Integer examWeek, String[][] matrix) {
        int n_rows = matrix.length;
        int n_cols = matrix[0].length;

        if (examWeek < 1) System.out.println("Constraint Broken: examWeek < 1");

            examWeek = examWeek - 1;            // examWeek >= 1    [given constraint in question]
            examWeek = examWeek % n_rows;
        int lastRows = examWeek;                // #rows from the bottom, that gets to top
        int newStart = n_rows - lastRows;
            newStart = newStart % n_rows;       // *if lastRows = 0

        REY_reverse(matrix, 0, n_rows-1);       // start = 0, end = n_rows-1  [inclusive]
        REY_reverse(matrix, 0, lastRows-1);
        REY_reverse(matrix, lastRows, n_rows-1);

        Arr.print2D(matrix);                    // yay, we did in in-place!

        int friendRow = 0;
        for (int r = 0; r < n_rows; r++) {
            for (int c = 0; c < n_cols; c++) {
                if (matrix[r][c] == "AA") {
                    return r+1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}
