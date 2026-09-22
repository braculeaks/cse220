// Assignment Task 01: Row Rotation Policy

class AssgnTask1 
{
    public static Integer rowRotation(Integer examWeek, String[][] matrix) {
        int n_rows = matrix.length;
        int n_cols = matrix[0].length;

        if (examWeek < 1) {
            System.out.println("Constraint Broken: examWeek < 1");
        }

            examWeek = examWeek - 1;        // examWeek >= 1    [given constraint in question]
            examWeek = examWeek % n_rows;
        int lastRows = examWeek;            // #rows from the bottom that we need to print first
        int startRow = n_rows - lastRows;

        String[][] out_rows = new String[n_rows][];     // Can you try without taking this new 1D_Array?

        for (int i = 0; i < lastRows; i++) {
            out_rows[i] = matrix[startRow+i];
        }

        for (int i = lastRows; i < n_rows; i++) {
            out_rows[i] = matrix[i-lastRows];
        }

        Arr.print2D(out_rows);

        int friendRow = 0;
        for (int r = 0; r < n_rows; r++) {
            for (int c = 0; c < n_cols; c++) {
                if (out_rows[r][c] == "AA") {
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
