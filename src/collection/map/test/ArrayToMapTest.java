package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] arr = {{"java","1000"},{"spring","2000"},{"jpa","3000"}};

        Map<String,Integer> map = new HashMap<>();
        for (String[] list:arr){
            String key = list[0];
            String value = list[1];
           map.put(key,Integer.valueOf(value));

        }


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
