package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {
    public static void main(String[] args) {
        //대표적인 구현체 ArrayDeque가 성능적으로 빠르다
        Deque<Integer> deque = new ArrayDeque<>();  //모든 면에서 성능이 빠르다
        //Deque<Integer> deque1 = new LinkedList<>();

        //데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);//앞쪽에서 넣음
        deque.offerLast(3);
        deque.offerLast(4);
        System.out.println(deque);

        //다음데이터 단순 조회
        System.out.println("deque.peekFirst() = " + deque.peekFirst());// 앞에 나올 데이터 조회
        System.out.println("deque.peekLast() = " + deque.peekLast());

        //데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println(deque);

        deque.peekLast();
        deque.peekLast();
        System.out.println(deque);
    }
}
