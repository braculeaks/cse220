package LabTask1;
public class StackLabTaskTester {
    
    // You have to write this method
    // NO NEED TO SUBMIT LAB TASK
    public static void removeBlock(Stack stack, int n) {
        // To Do
    }

    //DO NOT CHANGE THIS METHOD
    // This method is for printing the element of the stack. No need to modify anything.
    public static void printStack(Stack stack) {
        if (stack==null || stack.isEmpty()) {
            //System.out.println("null");
            return; //remove this line once your're done
        }
        int elem = stack.pop();
        System.out.printf("| %2d |\n",elem);
        printStack(stack);
        stack.push(elem);
    }

    //DO NOT CHANGE THIS METHOD
    public static void assertTest(int actual, int expected) {
        if (actual == expected) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed! Expected: " + expected + ", but got: " + actual);
        }
    }


    //DO NOT CHANGE ANYTHING IN THE DRIVER CODE
    public static void main(String[] args) {
        // This part is for checking how the Stack class and printing working
	System.out.println("Demo of Stack class methods and Stack Printingn\n");
	Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(5);
        s.push(1);
        s.push(9);

        printStack(s);
        System.out.println("------\nCalling pop()\n");
	s.pop();
        printStack(s);
        System.out.println("------");
        System.out.println("--- Checking Ended ---\n");
        // Checking End Here

        System.out.println("====== Tests Starts Here =======\n");

        System.out.println("Test 01");
        Stack st1 = new Stack();
        st1.push(4);
        st1.push(19);
        st1.push(23);
        st1.push(17);
        st1.push(5);

        System.out.println("Given Stack:");
        printStack(st1);
        System.out.println("------");
        System.out.println("Value of N = 2\n");
        removeBlock(st1, 2);

        System.out.println("After Removal");
        printStack(st1);
        System.out.println("------\n");

        System.out.println("======================================");
        System.out.println();

        System.out.println("Test 02");
        Stack st2 = new Stack();
        st2.push(73);
        st2.push(85);
        st2.push(15);
        st2.push(41);

        System.out.println("Stack:");
        printStack(st2);
        System.out.println("------");
        System.out.println("Value of N = 3\n");
        removeBlock(st2, 3);

        System.out.println("After Removal");
        printStack(st2);
        System.out.println("------\n");

        System.out.println("====== Tests Ends Here =======\n");
    }
}
