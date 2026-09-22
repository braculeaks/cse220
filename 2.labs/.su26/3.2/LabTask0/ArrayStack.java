public class ArrayStack 
{
    private Object[] stack;
    private int top;

    public ArrayStack(int size) {
        stack = new Object[size];
        top = -1;
    }

    public void push(Object element) {
        top++;

        if (top == stack.length) {
            System.out.println("ERROR 1: Stack is full. [OVERFLOW]");
            top--;
            return;
        }

        stack[top] = element;
    }

    public Object pop() {
        if (top == -1) {
            System.out.println("Stack is empty. [UNDERFLOW]");
            return null;
        }
        
        Object x = stack[top];
        top--; return x;
    }

    public Object peek() {
        if (top == -1) return null;
        else return stack[top];
    }

    public boolean isEmpty() {
        return (top == -1) ? true : false;
    }    
}
