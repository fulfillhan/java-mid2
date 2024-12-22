package collection.set;

public class HashCodeMyHashSetMain {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //284720968   ,  65
        System.out.println("m2.hashCode() = " + m2.hashCode()); //1534030866  ,  65
        System.out.println("m1.equals(set2) = " + m1.equals(m2)); //false

        //기본적으로 object 의 hashCode는 참조값을 기준으로 해시코드를 반환한다.
        //각 객체를 생성하면 참조값을 다르므로 해시코드도 다르다.
        //해시코드가 다르면 equals도 다르다. 참조가 다르니 다른값으로 보는것.

        set.add(m1);
        set.add(m2);
        System.out.println("set = " + set);
        // 데이터가 중복으로 들어감.. 같은 데이터 이지만 참조값이 달라서 다른값으로 인지

        //검색
        MemberOnlyHash member = new MemberOnlyHash("A");  //또 새로운 객체 생성 -> 참조값은 또 달라짐
        System.out.println("member.hashCode() = " + member.hashCode());
        boolean contains = set.contains(member);
        System.out.println("contains = " + contains);//false


    }
}
