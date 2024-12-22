package collection.deque.dequeTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Deque<String> printerQueue = new ArrayDeque<>();
        //데이터 넣기
        printerQueue.offer("doc1");
        printerQueue.offer("doc2");
        printerQueue.offer("doc3");

        //데이터 꺼내기
        System.out.println("출력 = " + printerQueue.poll());
        System.out.println("출력 = " + printerQueue.poll());
        System.out.println("출력 = " + printerQueue.poll());

            /*출력 = doc1
        출력 = doc2
        출력 = doc3
*/
    }
}
