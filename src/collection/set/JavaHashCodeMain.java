package collection.set;

import collection.set.member.Member;

import java.sql.SQLOutput;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object 기본 hashCode 객체의 참조값 기반으로 생성한다.
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println("o1.hashCode() = " + o1.hashCode());
        System.out.println("o2.hashCode() = " + o2.hashCode());

        //각 클래스마다 hashCode는 오버라이딩 되어 있다.
        Integer i = 10;
        String strA = "A";
        String strB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strB.hashCode() = " + strB.hashCode());


        Member memberA = new Member("idA");
        Member memberB = new Member("idA");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);


        //==  비교
        System.out.println(memberA == memberB);//false 동일성 (참조값 다름)
        //equals 비교
        System.out.println(memberA.equals(memberB));//true 동등성

        //hashCode 오버라이딩x
        System.out.println("memberA.hashCode() = " + memberA.hashCode());
        System.out.println("memberB.hashCode() = " + memberB.hashCode());
//        memberA.hashCode() = 664223387
//        memberB.hashCode() = 824909230

        //hashCode 오버라이딩o  오버라이딩 해서 해시코드를 맞춤
        System.out.println("memberA.hashCode() = " + memberA.hashCode());
        System.out.println("memberB.hashCode() = " + memberB.hashCode());
//        memberA.hashCode() = 104101
//        memberB.hashCode() = 104101

    }
}
