package collection.generic.ex1;

public class BoxMain {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer1 = (Integer) integerBox.get();  //다운 캐스팅
        System.out.println("integer1 = " + integer1);


    }
}
