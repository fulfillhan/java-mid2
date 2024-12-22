package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String , Integer> studentMap = new HashMap<>();
        //추가
        studentMap.put("student1",90);
        studentMap.put("student2",80);
        studentMap.put("student3",70);
        studentMap.put("student4",60);
        studentMap.put("student5",50);
        System.out.println("studentMap = " + studentMap);
        // 순서보장하지 않음

        //키를 기준으로 값 꺼내기
        Integer result = studentMap.get("student2");
        System.out.println("result = " + result);

        //키를 모두 꺼내기
        Set<String> keySet = studentMap.keySet();
        // set자료구조에 담긴다, 왜냐하면 키는 중복을 허용하지 않고 순서도 보장하지 않기 때문에
        System.out.println("keySet = " + keySet);

        for (String key:keySet){
            Integer value = studentMap.get(key);
            System.out.println("key = " + key+" value = "+value);
        }

        //키값을 묶어서 조회하기  ENTRY클래스는 키-값을 묶어서 저장할 수 있는 객체이다.
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key+", value = "+value);
        }

        //값만 꺼내기
        Collection<Integer> values = studentMap.values();

        //컬렉션으로 반환: 값만 여러개 꺼낸다
        for (Integer value : values){
            System.out.println("value = " + value);
        }


    }
}
