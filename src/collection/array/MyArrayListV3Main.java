package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        //ArrayList자료구조는 중복값 저장이 가능하며, 순서를 보장한다.
        System.out.println("== 데이터 추가 ===");
        list.add("a");
        System.out.println("list = " + list);
        list.add("b");
        System.out.println("list = " + list);
        list.add("c");

        //마지막에 추가
        list.add(3,"d");//o(1)
        System.out.println("list = " + list);

        //앞에 추가
        list.add(0,"z"); // o(n)
        System.out.println("list = " + list);

        //마지막 삭제
        Object remove1 = list.remove(4);//o(1)
        System.out.println("remove1 = " + remove1);
        System.out.println("list = " + list);

        //앞에 삭제
        Object remove2 = list.remove(0); // o(n)
        System.out.println("remove2 = " + remove2);
        System.out.println("list = " + list);

    }

}
