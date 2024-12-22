package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.chechHashMap();
    }
    public void chechHashMap(){
        HashMap<String,String> map = new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        System.out.println(map);
        Set<String> key = map.keySet();
        System.out.println(key);
        for (String result:key){
            System.out.println(map.get(result));
        }

        //값만 꺼내오기
        Collection<String> values = map.values();
        for (String value:values){
            System.out.println("value = " + value);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> result : entries){
            System.out.println(result.getKey()+" : "+result.getValue());
        }
    }
}
