public class StackTester 
{
    public static void main(String[] args) 
    {
        ArrayStack stack = new ArrayStack(5);

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("\nPushing elements...");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Attempting overflow push:");
        stack.push(60);   // should trigger overflow

        System.out.println("\nTop element: " + stack.peek());

        System.out.println("\nPopping elements...");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("\nAttempting underflow pop:");
        System.out.println(stack.pop());   // should trigger underflow

        System.out.println("\nIs stack empty? " + stack.isEmpty());
    }
}
