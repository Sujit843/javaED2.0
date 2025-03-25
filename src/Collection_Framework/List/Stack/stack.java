package Collection_Framework.List.Stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(); //  LIFO
        stack.push(18);   // adding
        stack.push(19);
        stack.push(17);
        stack.push(16);
        stack.push(15);
        stack.push(10);
        System.out.println(stack);
        stack.pop();
        Integer removeElement = stack.pop();
        System.out.println(removeElement);
        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(18));
    }
}
