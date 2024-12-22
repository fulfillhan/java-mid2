package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationMain {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        //합집합
        HashSet<Integer> union = new HashSet<>();
        union.addAll(set1);//지정된 컬렉션의 모든 요소를 저장한다
        union.addAll(set2);
        System.out.println("union = " + union);

        //교집합 중복된 것만
        Set<Integer> intersaction = new HashSet<>(set1);
        intersaction.retainAll(set2);  // 컬렉션에 포함된 요소만 유지하고 나머지 제거한다
        System.out.println("intersaction = " + intersaction);

        //차집합
        Set<Integer> difference = new HashSet<>(set1);
       difference.removeAll(set2);
        System.out.println("difference = " + difference);
    }
}
