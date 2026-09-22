//YOU NEED TO RUN THIS CLASS TO TEST OUT THE METHODS
package AssignmentTask2;

public class HotPotato
{
    public static String hotPotato(String[] players, int k) 
    {
        LinkedListQueue q0 = new LinkedListQueue();
        for (int i = 0; i < players.length; i++) {
            q0.enqueue(players[i]);
        }


        String x = "";

        while (true) 
        {
            for (int i = 0; i < k; i++) {
                x = (String) q0.dequeue();
                q0.enqueue(x);
            }

            x = (String) q0.dequeue();
            if (q0.isEmpty()) break;

            System.out.println(x + " eliminated");
        }

        return x;       // x is winner
    }

    public static void main(String[] args) {

        System.out.println(".......Test Case #1.......");
        String[] players1 = {"Ali", "Ben", "Cia", "Dan", "Eli", "Faye"};
        int k1 = 3;
        String winner1 = hotPotato(players1, k1);
        System.out.println("Winner: " + winner1);

        System.out.println(".......Test Case #2.......");
        String[] players2 = {"Ali", "Rafi", "Sara", "Nina"};
        int k2 = 2;
        String winner2 = hotPotato(players2, k2);
        System.out.println("Winner: " + winner2);
    }
}
