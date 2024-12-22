package collection.set;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);

        //검색
        String searchWord = "SET";
        boolean contains = set.contains(searchWord);
        System.out.println(searchWord+" contains = " + contains);
    }
}
