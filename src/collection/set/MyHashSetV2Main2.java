package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        //내가 직접 만든 객체를 적용할 때
        MyHashSetV2 set = new MyHashSetV2(20);
        Member java = new Member("java");
        Member spring = new Member("spring");
        Member jpa = new Member("jpa");
        Member jj = new Member("jj");

        System.out.println("java"+java.hashCode());
        System.out.println("spring"+spring.hashCode());
        System.out.println("jpa"+jpa.hashCode());
        System.out.println("jj"+jj.hashCode());


        set.add(java);
        set.add(spring);
        set.add(jpa);
        set.add(jj);
        System.out.println(set);

    }
}
