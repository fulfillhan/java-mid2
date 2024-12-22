package collection.set.member;

import java.util.HashSet;
import java.util.Set;


public class HashMain {
    public static void main(String[] args) {
        Set<English> set = new HashSet<>();
        set.add(new English("A"));
        set.add(new English("B"));
        set.add(new English("AB"));
        set.add(new English("AB"));// 중복값 저장하려고 함
        set.add(new English("BC"));
        System.out.println("set = " + set);

        /* 실행 결과
        set = [English{word='A'}, English{word='AB'}, English{word='BC'}, English{word='B'}]
         */

    }
}
