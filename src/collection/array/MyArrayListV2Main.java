package collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(2);
        //ArrayList자료구조는 중복값 저장이 가능하며, 순서를 보장한다.
        System.out.println("== 데이터 추가 ===");
        list.add("a");
        System.out.println("list = " + list);
        list.add("b");
        System.out.println("list = " + list);
        list.add("c");
        System.out.println("list = " + list);
        list.add("d");
        System.out.println("list = " + list);
        list.add("d");
        System.out.println("list = " + list);
        //범위가 초과되었지만 길이가 늘어나면서 데이터가 저장됨
        list.add("c");
        System.out.println("list = " + list);
    }

}
