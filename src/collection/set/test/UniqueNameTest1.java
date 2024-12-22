package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNameTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        run(inputArr);

    }
    private static void run (Integer[] inputArr){
      Set<Integer> set = new HashSet<>();
      //하나씩 넣고
      for (Integer value : inputArr){
          set.add(value);
      }
      //하나씩 조회 하기
      for (Integer result : set ){
          System.out.println(result);
      }
    }
}
