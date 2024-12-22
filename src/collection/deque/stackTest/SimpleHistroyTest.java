package collection.deque.stackTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistroyTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        //stack을 사용해도 되지만 Deque의 ArrayDeque를 쓰는게 성능상 좋다.
        stack.push("youtube");
        stack.push("google");
        stack.push("facebook");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
