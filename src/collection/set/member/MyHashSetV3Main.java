package collection.set.member;

import collection.set.MySet;

import java.util.HashSet;
import java.util.Set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String > set = new MyHashSetV3<>(10);
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println("set = " + set);

        //검색
        String searchValue = "a";
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
