package collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        HashMap<String, Integer> wordMap = new HashMap<>();

        //문자열 잘라서 배열로 반환하기
        String[] words = text.split(" ");
        for (String word : words){
         /*   Integer count = wordMap.getOrDefault(word, 0);
            count++;
            wordMap.put(word,count);*/
            wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }
        System.out.println(wordMap);


    }
}
