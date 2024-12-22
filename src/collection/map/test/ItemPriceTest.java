package collection.map.test;

import java.util.*;

public class ItemPriceTest {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("사과",500);
        hashMap.put("바나나",500);
        hashMap.put("망고",1000);
        hashMap.put("딸기",1000);

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == 1000){
                String key = entry.getKey();
                list.add(key);
            }
        }
        System.out.println(list);

    }
}
