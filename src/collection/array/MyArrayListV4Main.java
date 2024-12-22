package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        //stringList.add(1);
        String string = stringList.get(2);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        //integerList.add("a");
        Integer integer = integerList.get(2);
        System.out.println("integer = " + integer);

    }
}
