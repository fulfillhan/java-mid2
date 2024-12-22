package collection.set;

public class MemberNoHashNoEq {
    //equals 와 hashcode 재정의 하지 않음
    private String id;

    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
