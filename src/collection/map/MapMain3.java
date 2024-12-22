package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain3 {
    // Map의 특징은 동일한 키를 넣으려고 하면기존 값을 교체해서 저장한다.

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("student1",100);
        System.out.println("처음의 student1 = "+studentMap);

        //학생이 없는 경우에만 추가 1
        if(!studentMap.containsKey("student2")){// 해당 키 값이 없으면
            studentMap.put("student2", 90);
        }
        System.out.println("studentMap = " + studentMap);

        //학생이 없는 경우에만 추가 2
        studentMap.putIfAbsent("student2",80); // 없는 경우에만 저장하는 메서드
        studentMap.putIfAbsent("student3",70);
        System.out.println("studentMap = " + studentMap);

    }
}
