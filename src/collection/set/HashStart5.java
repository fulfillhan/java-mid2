package collection.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

  public static void main(String[] args) {    
      LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];  //자로구조를 배열로 나열함
      for (int i = 0; i < CAPACITY; i++) {
          buckets[i] = new LinkedList<>();
      }
      add(buckets,1);
      add(buckets,2);
      add(buckets,5);
      add(buckets,8);
      add(buckets,14);
      add(buckets,99);
      add(buckets,9);
      System.out.println(" buckets = " + Arrays.toString(buckets));

      //검색해보기
      int searchValue = 9;
      boolean contains = Contains(buckets,searchValue);
      System.out.println("result = "+contains);
  }

    private static boolean Contains(LinkedList<Integer>[] buckets,int searchValue) {
        int hashIndex = HashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = HashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if(!bucket.contains(value)){  //중복값이 들어가지 않게 한다.
            bucket.add(value);
        }

    }

    private static int HashIndex(int value) {
      return value % CAPACITY;
    }


}
