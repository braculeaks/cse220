
class AssgnTask3
{
    public static void playGame(Integer[][] arena) {
        int n_rows = arena.length;
        int n_cols = arena[0].length;

        int ans = 0;

        for (int r = 0; r < n_rows; r++) {
            for (int c = 0; c < n_cols; c++) 
            {
                if (arena[r][c] > 0 && arena[r][c] % 50 == 0) {
                    int top = r-1;
                    int bottom = r+1;
                    int left = c-1;
                    int right = c+1;

                    if (   top >= 0     && arena[top][c]    == 2) ans++;
                    if (bottom < n_rows && arena[bottom][c] == 2) ans++;
                    if (  left >= 0     && arena[r][left]   == 2) ans++;
                    if ( right < n_cols && arena[r][right]  == 2) ans++;
                }
            }
        }

        int points = ans*2;
        if (points < 10) System.out.println("Points Gained: " + points + ". Your team is out.");
        else             System.out.println("Points Gained: " + points + ". Your team has survived the game.");
    }

    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}
