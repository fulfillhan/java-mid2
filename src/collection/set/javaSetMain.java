package collection.set;

import java.util.*;

public class javaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>());//입력한 순서를 보장하지 않는다.
        run(new LinkedHashSet<>());//저장된 순서로 입력한순서를 보장한다.
        run(new TreeSet<>());// 데이터 자체 값 기준으로 정렬한다.ㅗㅕ

    }
    private static void run(Set<String> set){
        set.add("c");
        set.add("b");
        set.add("a");
        set.add("1");
        set.add("2");
        System.out.println("set = " + set);

        //순회
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){// 다음데이터가 있는지 유무 확인한다.
            System.out.print(iterator.next()+ " "); //다음 데이터를 반환한다. 현재 데이터를 꺼내고 다음으로 넘어간다
        }
        System.out.println();
    }
}
