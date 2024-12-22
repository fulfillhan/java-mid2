package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("student1",100);
        System.out.println("처음의 student1 = "+studentMap);

        studentMap.put("student1", 90);
        System.out.println("값을 변경할 경우 = "+studentMap);

        //해당 키의 값이 변경되면 기존것에 덮어버린다.

        // 키값이 있는지 여부를 확인한다.
        boolean result = studentMap.containsKey("student1");
        System.out.println("result = " + result);

        //특정 학생의 값을 삭제한다. 키-값 모두 삭제됨
        studentMap.remove("student1");
        System.out.println("studentMap = " + studentMap);

    }
}
