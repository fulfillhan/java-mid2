package collection.map.test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        // 단어 입력 단계
        HashMap<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("영어 단어를 입력하세요 : ");
            String englishWord = scanner.nextLine();

            if(englishWord.equals("q")){
                break;
            }
            System.out.print("한글  뜻을 입력하세요 : ");
            String koreanMeaning = scanner.nextLine();

            dictionary.put(englishWord,koreanMeaning);
        }
        // 단어 검색 단계
        System.out.println("== 단어 검색 단계 ==");

        while(true){
            System.out.print("찾을 영단어를 입력하세요 : ");
            String searchEnglish = scanner.nextLine();

            if(searchEnglish.equals("q")){
                break;
            }

            System.out.print(searchEnglish+"의 뜻 : ");

            if(dictionary.containsKey(searchEnglish)){
                String value = dictionary.get(searchEnglish);
                System.out.println(value);
            }else{
                System.out.println("사전에 없는 단어입니다.");
            }

        }
    }
}
