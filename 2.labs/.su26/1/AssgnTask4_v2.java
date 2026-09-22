class AssgnTask4_v2
{
    public static void rotateOnce(Character[][] board, int topLeft, int size) {
        int lef = topLeft;         // 0
        int rig = lef+size-1;      // 3
        int top = topLeft;         // 0
        int bot = top+size-1;      // 3

        Character tmp = board[top][lef];

        for (int r = top; r < bot; r++) board[r][lef] = board[r+1][lef];
        for (int c = lef; c < rig; c++) board[bot][c] = board[bot][c+1];
        for (int r = bot; r > top; r--) board[r][rig] = board[r-1][rig];
        for (int c = rig; c > lef; c--) board[top][c] = board[top][c-1];

        board[top][lef+1] = tmp;
    }
    
    public static void rotateSecret(Character[][] board) {
        int n = board.length;                   // given: always even, n*n board
        int levels = n/2;

        for (int i = 0; i < levels; i++) {
            for (int k = 0; k < (i+1); k++) {
                rotateOnce(board, levels-i-1, (i+1)*2);     // board, topLeft, size
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(board[r][c]);
            }
        }
        System.out.println("");
    }

    public static void main(String[] args){
        System.out.print("===========Test#1===========\n");
        Character[][] board = {
          {'T','A','U','S'},
          {'A','R','I','.'},
          {'D','T','T','N'},
          {'S','C','F','U'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        Character[][] outputBoard = {
            {'D','A','T','A'},
            {'S','T','R','U'},
            {'C','T','I','S'},
            {'F','U','N','.'}
        };
        System.out.print("DATASTRUCTISFUN.\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 1 Success");
        else System.out.println("Test 1 FAILED");
        
        System.out.print("\n===========Test#2===========\n");

        board = new Character[][]{
          {'O','R','I','R','N','P'},
          {'G','S','A','A','L','R'},
          {'L','M','N','O','N','Y'},
          {'A','H','U','O','O','P'},
          {'T','F','C','T','H','S'},
          {'E','D','Y','O','C','K'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        outputBoard = new Character[][]{
            {'A','L','G','O','R','I'},
            {'T','H','M','S','A','R'},
            {'E','F','U','N','A','N'},
            {'D','C','O','O','L','P'},
            {'Y','T','H','O','N','R'},
            {'O','C','K','S','P','Y'}
        };
        System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKSPY\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 2 Success");
        else System.out.println("Test 2 FAILED");
    }
}
