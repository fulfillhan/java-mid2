package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValue {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("a",1,"b",2,"c",3);
        //이렇게 넣을 수도 있음-> 반환은 Map으로
        //단점은 내부 값을 수정할 수 없다.

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("b",4);
        map2.put("c",5);
        map2.put("d",6);

        HashMap<String, Integer> result = new HashMap<>();

        for (String key: map1.keySet()){
            if (map2.containsKey(key)) {
                int sum = map1.get(key) + map2.get(key);
               result.put(key,sum);
            }
        }

        System.out.println(result);


    }
}
