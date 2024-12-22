package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyLinkedList<Integer> list = new MyLinkedList<>();
        MyArrayList<Integer> list = new MyArrayList<>();
        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(50000);
        //크기 = 50000 계산 시간 = 14ms -> MyLinkedList
        //크기 = 50000 계산 시간 = 3132ms -> MyArrayList  엄청 느리다...
    }
}
