package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        HashMap<String, Integer> wordMap = new HashMap<>();

        //문자열 잘라서 배열로 반환하기
        String[] words = text.split(" ");
        for (String word : words){
            Integer count = wordMap.get(word);// 키를 넣으면 값을 반환하는데 null을 허용한다.
            if(count == null){
                count = 0;
            }
            count++;
            wordMap.put(word,count);
        }


    }
}
