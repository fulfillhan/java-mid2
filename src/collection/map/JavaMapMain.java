package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());  //키를 기준으로 저장한 순서 보장
        run(new TreeMap<>());//키 자체의 데이터 값을 기준으로 정렬한다.
    }
    private static void run(Map<String, Integer> map){
        map.put("C",10);
        map.put("B",20);
        map.put("A",30);
        map.put("1",40);
        map.put("2",50);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key+", value = "+value);
        }
        System.out.println();
    }
}

