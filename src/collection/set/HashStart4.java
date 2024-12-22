package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 1;

    public static void main(String[] args) {
        System.out.println("hashIndex(1) = "+hashIndex(1));
        System.out.println("hashIndex(2) = "+hashIndex(2));
        System.out.println("hashIndex(5) = "+hashIndex(5));
        System.out.println("hashIndex(8) = "+hashIndex(8));
        System.out.println("hashIndex(14) = "+hashIndex(14));
        System.out.println("hashIndex(99) = "+hashIndex(99));

        Integer[] inputArrays = new Integer[CAPACITY];
        add(inputArrays, 1);
        add(inputArrays, 2);
        add(inputArrays, 5);
        add(inputArrays, 8);
        add(inputArrays, 14);
        add(inputArrays, 99);
        System.out.println("inputArrays = "+Arrays.toString(inputArrays));

        //검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);
        Integer result = inputArrays[searchValue];
        System.out.println(result);
    }

    private static void add(Integer[] inputArrays, int value) {
        int hashIndex = hashIndex(value);
        inputArrays[hashIndex] = value;
    }

    static int hashIndex(int value){
        return  value % CAPACITY;
    }
}
