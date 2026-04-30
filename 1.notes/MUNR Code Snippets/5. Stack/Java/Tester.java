public class Tester {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4); // Pushes 4 into stack
        st.push(3); // Pushes 3 into stack
        st.push(5); // Pushes 5 into stack
        st.push(1); // Pushes 1 into stack
        st.push(9); // Pushes 9 into stack

        System.out.println("Peeked element " + st.peek()); // Returns 9
        System.out.println("Popped element " + st.pop()); // Removes 9
        System.out.println("Popped element " + st.pop()); // Removes 1
        System.out.println("Popped element " + st.pop()); // Removes 5
        System.out.println("Peeked element " + st.peek()); // Returns 3
        System.out.println("Popped element " + st.pop()); // Removes 3
        System.out.println("Popped element " + st.pop()); // Removes 4
        System.out.println("Peeked element " + st.peek()); // Returns -1 (Stack Underflow)
        System.out.println("Popped element " + st.pop()); // Returns -1 (Stack Underflow)
        System.out.println(st.isEmpty()); // Returns True
    }
}
