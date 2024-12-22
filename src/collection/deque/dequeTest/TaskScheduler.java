package collection.deque.dequeTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {
    private Deque<Tesk> tesks = new ArrayDeque<>();

    public void addTask(Tesk tesk) {
        if(tesk != null){
            tesks.offer(tesk);
        }
    }

    public int getRemaningTasks() {
        return tesks.size();
    }

    public void processNextTask() {
        Tesk task = tesks.poll(); // 넣은 순서대로 나온다.
        if(task != null){
            task.execute();
        }
    }
}
