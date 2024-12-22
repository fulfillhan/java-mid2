package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);  //해시 충돌
        System.out.println(set);

        //검색
        int searchValue = 9;
        boolean contains = set.contains(searchValue);
        System.out.println("searchValue = " + searchValue+" "+contains);

        //삭제
        int removeValue = 9;
        boolean remove = set.remove(removeValue);
        System.out.println("remove = " + remove);
        System.out.println(set);


    }
}
