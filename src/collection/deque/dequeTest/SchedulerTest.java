package collection.deque.dequeTest;

public class SchedulerTest {
    public static void main(String[] args) {
        //낮에 작업 저장
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new CompressionTesk());
        scheduler.addTask(new BackupTesk());
        scheduler.addTask(new CleanTesk());


        //새벽 시간 실행
        System.out.println("작업 시작");
        run(scheduler);
        System.out.println("작업 완료");
    }

    private static void run(TaskScheduler scheduler) {
        while(scheduler.getRemaningTasks() > 0){
            scheduler.processNextTask();
        }
    }

}
