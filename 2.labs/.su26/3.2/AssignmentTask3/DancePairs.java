import HelperDataStructures.Stack;
import HelperDataStructures.Queue;

public class DancePairs 
{
    public static boolean isFemale(Dancer d) {return d.getGender() == 'F';}
    public static boolean isMale  (Dancer d) {return d.getGender() == 'M';}
    public static void dance_pair(Stack stk) {
        Queue fQ = new Queue();     // femaleQueue
        Queue mQ = new Queue();     // maleQueue

        int c = 0;
        Dancer n0 = (Dancer) stk.pop();
        Dancer n1 = (Dancer) stk.pop();

        while(true) 
        {
            if ((isFemale(n0) && isMale(n1)) || (isMale(n0) && isFemale(n1))) {
                c++;
                System.out.println("#" + c + " " + n0 + " & " + n1);

                if (stk.isEmpty()) break; n0 = (Dancer) stk.pop();
                if (stk.isEmpty()) {
                    fQ.enqueue(n0);
                    break;
                }
                n1 = (Dancer) stk.pop();
                
                continue;
            }

            if (isFemale(n0) && isFemale(n1)) {
                fQ.enqueue(n0);

                n0 = n1;
                if (stk.isEmpty()) {
                    fQ.enqueue(n1);
                    break;
                }
                n1 = (Dancer) stk.pop();
            }

            if (isMale(n0) && isMale(n1)) {
                if (fQ.isEmpty()) {
                    mQ.enqueue(n0);
                }
                else {
                    Dancer f = (Dancer) fQ.dequeue();
                    Dancer m = n0;

                    c++;
                    System.out.println("#" + c + " " + m + " & " + f);
                }

                n0 = n1;
                if (stk.isEmpty()) {
                    mQ.enqueue(n1);
                    break;
                }
                n1 = (Dancer) stk.pop();
            }
        }




        while (true) {
            if (fQ.isEmpty()) break;
            if (mQ.isEmpty()) break;

            Dancer m = (Dancer) mQ.dequeue();
            Dancer f = (Dancer) fQ.dequeue();

            c++;
            System.out.println("#" + c + " " + f + " & " + m);
        }





        if (fQ.isEmpty() == false) {
            System.out.println("Unpaired Female: ");

            System.out.print(fQ.dequeue());
            while (fQ.isEmpty() == false) {
                System.out.print(", " + fQ.dequeue());
            }

            System.out.println("");
        }

        if (mQ.isEmpty() == false) {
            System.out.println("Unpaired Male: ");

            System.out.print(mQ.dequeue());
            while (mQ.isEmpty() == false) {
                System.out.print(", " + mQ.dequeue());
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Test Case 1 =====");
        Stack stack1 = new Stack();
        stack1.push(new Dancer("Arif", 'M', 10));
        stack1.push(new Dancer("Maya", 'F', 54));
        stack1.push(new Dancer("Sara", 'F', 15));
        stack1.push(new Dancer("Liam", 'M', 24));
        stack1.push(new Dancer("Omar", 'M', 44));
        stack1.push(new Dancer("Nina", 'F', 12)); // TOP
        System.out.println("Given Stack of Dancers");
        printStack( stack1 );
        System.out.println("\nExpected Output:");
        System.out.println("#1 Nina(F-12) & Omar(M-44)\n#2 Liam(M-24) & Sara(F-15)\n#3 Maya(F-54) & Arif(M-10)");
        System.out.println("\nYour Output:\n");
        dance_pair(stack1);


        System.out.println("\n===== Test Case 2 =====");
        Stack stack2 = new Stack();
        stack2.push(new Dancer("Kazi", 'M', 45));
        stack2.push(new Dancer("Lara", 'F', 43));
        stack2.push(new Dancer("Nina", 'F', 29));
        stack2.push(new Dancer("Sami", 'M', 53));
        stack2.push(new Dancer("Arif", 'M', 51));
        stack2.push(new Dancer("Omar", 'M', 9));
        stack2.push(new Dancer("Lina", 'F', 12));
        stack2.push(new Dancer("Mina", 'F', 54));
        stack2.push(new Dancer("Rita", 'F', 43)); // TOP
        System.out.println("Given Stack of Dancers");
        printStack( stack2 );
        System.out.println("\nExpected Output:");
        System.out.println("#1: Lina(F-12) & Omar(M-09)\n#2: Arif(M-51) & Rita(F-43)\n#3: Sami(M-53) & Nina(F-29)\n#4: Lara(F-43) & Kazi(M-45)\nUnpaired Female:\nMina(F-54)");
        System.out.println("\nYour Output:\n");
        dance_pair(stack2);


        System.out.println("\n===== Test Case 3 =====");
        Stack stack3 = new Stack();
        stack3.push(new Dancer("Wafi", 'M', 13));
        stack3.push(new Dancer("Anan", 'M', 11));
        stack3.push(new Dancer("Nina", 'F', 75));
        stack3.push(new Dancer("Kazi", 'M', 32));
        stack3.push(new Dancer("Ali", 'M', 11));
        stack3.push(new Dancer("Maya", 'F', 65));
        stack3.push(new Dancer("Rafi", 'M', 23));
        stack3.push(new Dancer("Omar", 'M', 16));
        stack3.push(new Dancer("Lina", 'F', 52));
        stack3.push(new Dancer("Sara", 'F', 43)); // TOP
        System.out.println("Given Stack of Dancers");
        printStack( stack3 );
        System.out.println("\nExpected Output:");
        System.out.println("#1: Lina(F-52) & Omar(M-16)\n#2: Rafi(M-23) & Maya(F-65)\n#3: Ali(M-11) & Sara(F-43)\n#4: Kazi(M-32) & Nina(F-75)\nUnpaired Male:\nAnan(M-11), Wafi(M-13)");
	System.out.println("\nYour Output:\n");
        dance_pair(stack3);
    }
    
    //Actually Stack doesn't really have this type of print method
    //It's only being used to show you the Stack Visually
    public static void printStack(Stack stack) {
        if (stack==null || stack.isEmpty()) {
            return; //remove this line once your're done
        }
        Object elem = stack.pop();
        System.out.printf("| %2s |\n",elem);
        printStack(stack);
        stack.push(elem);
    }

}
