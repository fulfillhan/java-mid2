package collection.set;

import collection.set.member.Member;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Member member1 = new Member("A");
        Member member2 = new Member("A");

        //1. 동일한 hashcode 반환
        System.out.println(member1.hashCode()); //96
        System.out.println(member2.hashCode()); //96
        System.out.println(member1.equals(member2));  //true

        HashSet<Object> set = new HashSet<>();

        //2. 올바른 데이터 저장(중복값 x)
        set.add(member1);
        set.add(member2);
        System.out.println(set);
        //[Member{name='A'}]

        //3. 검색 성공
        Member serachMember = new Member("A");
        System.out.println(serachMember.hashCode()); //96

        boolean contains = set.contains(serachMember);
        System.out.println("isContain ? = "+contains);
        //isContain ? = true
    }
}
