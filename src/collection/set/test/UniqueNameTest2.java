package collection.set.test;

import java.util.*;

public class UniqueNameTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        run(inputArr);

    }
    private static void run (Integer[] inputArr){
        //입력값 배열을 기반으로 list로 생성한다.
        //List.of(inputArr) : 배열을 기반으로 List컬렉션으로 변경해준다.
        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(inputArr));


        // 배열을 리스트 생성하는 방법
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3);


        //하나씩 넣고
     /* for (Integer value : inputArr){
          linkedHashSet.add(value);
      }*/
      //하나씩 조회 하기
      for (Integer result : linkedHashSet ){
          System.out.println(result);
      }
    }
}
