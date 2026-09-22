package AssignmentTask1;
public class StackTaskTester {
    
    public static Stack conditionalReverse(Stack stack) {
        Stack s1 = new Stack();

        int x = stack.pop();
        s1.push(x);

        int last = x;
        while (!stack.isEmpty()) 
        {
            x = stack.pop();
            if (last == x) continue;

            s1.push(x);
            last = x;
        }

        return s1; 
    }

    //DO NOT CHANGE THIS METHOD
    // This method is for printing the element of the stack. No need to modify anything.
    public static void printStack(Stack stack) {
        if (stack==null || stack.isEmpty()) {
            return;
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
	System.out.println("Demo of Stack class methods and Stack Printing\n");
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

        System.out.println("====== Tests Starts Here =======");
        System.out.println("Test 01");
        Stack st = new Stack();
        st.push(10);
        st.push(10);
        st.push(20);
        st.push(20);
        st.push(30);
        st.push(10);
        st.push(50);

        System.out.println("Stack:");
        printStack(st);
        System.out.println("------");

        Stack reversedStack = conditionalReverse(st);

        System.out.println("After Calling Conditional Reversed Stack:");
        printStack(reversedStack); // Expected: 50, 10, 30, 20, 10
        System.out.println("------");

        System.out.println("====== Tests Ends Here =======");
    }
}
