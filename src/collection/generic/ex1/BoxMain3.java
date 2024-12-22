package collection.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integer = new GenericBox<>();//생성시점에 타입이 결정된다.
        integer.set(10);
      //  integer.set("a");//컴파일 오류
        Integer integer1 = integer.get();
        System.out.println("integer1 = " + integer1);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("A");
        //stringGenericBox.set(1);  컴파일 오류
        String s = stringGenericBox.get();
        System.out.println("s = " + s);

        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(0.1);
        Double aDouble = doubleGenericBox.get();
        System.out.println("aDouble = " + aDouble);
    }
}
