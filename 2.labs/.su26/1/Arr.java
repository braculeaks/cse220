//DO NOT TOUCH THIS CODE
class Arr{
    
    // HELPER METHOD TO COMPARE 2D ARRAY
    public static boolean compare2D(Object[][] arr1, Object[][] arr2) {
        if( arr1==null || arr2==null ) return false;
        
        int row1 = arr1.length, col1 = arr1[0].length;
        int row2 = arr2.length, col2 = arr1[0].length;
        if( row1!=row2 && col1!=col2 ) return false;

        for (int r=0; r<row1; r++) {
            for (int c=0; c<col1; c++) {
                if( ! arr1[r][c].equals(arr2[r][c]) ) return false;
            }
        }

        return true;
    }


    // HELPER METHOD TO PRINT 2D ARRAY
    public static void print2D(Object[][] arr) {
        if( arr!=null ){
            int maxWidth = findMaxWidth(arr);
            int row = arr.length, col = arr[0].length;
            for (int r=0; r<row; r++) {
                System.out.print("| ");
                for (int c=0; c<col; c++) {
                    System.out.printf("%-"+maxWidth+"s | ",arr[r][c]);
                }
                System.out.println();
            }
        } else {
            System.out.println(arr);
        }
    }

    // HELPER METHOD TO PRINT LINEAR ARRAY
    public static void print(Object[] arr) {
        if( arr!=null ){
            System.out.print("[ ");
            for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
        } else {
            System.out.println(arr);
        }
    }


    // HELPER METHOD TO FIND THE MAXIMUM ELEMENT LENGTH
    public static int findMaxWidth(Object[][] arr2D) {
        int maxWidth = 0;
        for (Object[] arr : arr2D) {
            for (Object elem : arr) {
                maxWidth = Math.max(maxWidth, elem.toString().length());
            }
        }
        return maxWidth;
    }

}
