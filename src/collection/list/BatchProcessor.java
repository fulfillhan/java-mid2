package collection.list;

public class BatchProcessor {

    //DIP 원칙 - 추상적인 것에 의존하고 의존관계 주입을 활용해라. 다형성을 잘 활용해야 하는 것.
    //OCP 원칙 - 클라이언트 코드를 변경하지 않고 기능을 추가함으로써 확장할 수 있다.
    private final MyList<Integer> list;  //인터페이스 의존

    //의존관계 주입 - 외부에서 생성자를 생성하는 시점에 arrayList로 할지, LinkedList로 할지 정한다.
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 = "+size+" 계산 시간 = "+(endTime-startTime)+"ms");
    }


}
