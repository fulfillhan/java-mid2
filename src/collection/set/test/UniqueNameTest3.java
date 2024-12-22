package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNameTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        run(inputArr);

    }

    private static void run(Integer[] inputArr) {
        Set<Integer> set = new TreeSet<>(List.of(inputArr));

        for (Integer result : set) {
            System.out.println(result);
        }
    }
}
