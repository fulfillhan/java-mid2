package collection.set.test;

import java.util.HashSet;
import java.util.Random;

public class RactangleTest {
    public static void main(String[] args) {
        HashSet<Ractangle> ractanglSet = new HashSet<>();
        ractanglSet.add(new Ractangle(10, 10));
        ractanglSet.add(new Ractangle(10,20));
        ractanglSet.add(new Ractangle(10,20)); //중복

        for (Ractangle result : ractanglSet) {
            System.out.println("result = " + result);
        }
    }
}
