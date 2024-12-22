package collection.deque;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // stack 요소 보기
        Integer peek = stack.peek();
        System.out.println(peek);

        //stack 요소 꺼내기
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
