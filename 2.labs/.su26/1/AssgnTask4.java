class AssgnTask4 
{
    public static void rotateSecret(Character[][] board) {
        int n = board.length;         // given: always even, n*n board

        int levels = n/2;

        for (int i = 0; i < levels; i++) 
        {
            for (int k = 0; k < (i+1); k++) 
            {
                int l = levels-i-1;         // 0
                int r = l+(i*2)+1;          // 3
                int t = levels-i-1;         // 0
                int b = t+(i*2)+1;          // 3

                int l2 = l;
                int t2 = t;

                Character last = board[t][l];
                while(l < r) {                      // rotate Top row, save tmp
                    Character tmp = board[t][l+1];
                    board[t][l+1] = last;
                    last = tmp;
                    l++;
                }

                while(t < b) {                      // rotate Right col, save tmp
                    Character tmp = board[t+1][l];
                    board[t+1][l] = last;
                    last = tmp;
                    t++;
                }

                while(r > l2) {                     // rotate Bottom row, save tmp
                    Character tmp = board[t][r-1];
                    board[t][r-1] = last;
                    last = tmp;
                    r--;
                }

                while(b > t2) {                     // rotate Left col, save tmp
                    Character tmp = board[b-1][r];
                    board[b-1][r] = last;
                    last = tmp;
                    b--;
                }
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
