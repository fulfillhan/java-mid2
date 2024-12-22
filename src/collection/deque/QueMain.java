package collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueMain {
    public static void main(String[] args) {
        //queue  선입선출
        Queue<Integer> queue = new ArrayDeque<>();
        //Queue<Integer> queue1 = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        //다음 꺼낼 데이터 확인하기-> 조회만
        System.out.println(queue.peek());// 살짝 찝어서 본다?

        //데이터 꺼내기
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
