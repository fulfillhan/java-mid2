package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer>deque = new ArrayDeque<>();  //stack과 que 로 모두 사용 가능

        //stack으로 사용할 때

        deque.push(1);
        deque.push(2);
        deque.push(3);

        System.out.println(deque.peek());

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque);

    }
}
