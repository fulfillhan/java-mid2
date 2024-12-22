package collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("== 데이터 추가 ===");
        list.add("a");
        System.out.println("list = " + list);
        list.add("b");
        System.out.println("list = " + list);
        list.add("c");
        System.out.println("list = " + list);

        System.out.println("== 기능 사용 === ");

        //몇개의 데이터가 들어있나요? -3개
        System.out.println("list.size() = " + list.size());

        //idx = 1 번째 값은 무엇인가요? - b
        System.out.println("list.get(1) = " + list.get(1));

        //'c'값의 인덱스는 몇번째 인가요? 2번째
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));

        //인덱스 2 에 "z"를 넣을거고 기존값은 무엇이였나요? - c
        System.out.println("list.set(2,\"z\") = " + list.set(2, "z"));

        //범위가 초과하면 어떻게 되나요?
        list.add("d");
        list.add("e");
        System.out.println("list = " + list);
        //list = [a, b, z, d, e], size = 5, capacity = 5

        //범위가 초과됨
        list.add("c");
        System.out.println("list = " + list);

        //예외 발생 - 배열의 크기가 초과되었다!!!
        //.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}
