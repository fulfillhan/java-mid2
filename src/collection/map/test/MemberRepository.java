package collection.map.test;

import collection.map.test.Member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        String id = member.getId();
        memberMap.put(id,member);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        Collection<Member> members = memberMap.values();
        for (Member member : members){
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }

    public void remove(String id) {
        memberMap.remove(id);
    }
}
