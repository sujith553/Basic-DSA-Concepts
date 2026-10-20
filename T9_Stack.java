import java.util.Stack;

public class T9_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        // pop
        System.out.println(stack.pop()); // 40
        System.out.println(stack); // checking whether 40 came our or not

        // peek
        System.out.println(stack.peek());

        // isEmpty
        System.out.println(stack.isEmpty());

    }
}
