package collection.generic.ex5;

import collection.generic.animal.Animal;

public class WildCardEx {
    //제네릭 타입을 받아서 반환하기


    //와일드 카드는 제네릭을 쉽게 사용할 수 있게 하는 도구다
    static <T> void printGenericV1(Box<T> box){
        System.out.println("box.getValue() = " + box.getValue());

    }


    static void printWildCard(Box<?> box){
        System.out.println("? = "+box.getValue());
    }

    //제네릭 타입의 제한걸기
    static <T extends Animal> void printGeneric1(Box<T> box){
        T t = box.getValue();
        System.out.println("t.getName() = " + t.getName());
    }

    static void printWildCard2(Box<? extends Animal> box){
        Animal value = box.getValue();
        System.out.println("value.getName() = " + value.getName());
    }

    //네릭 타입의 제한걸기 =  출력에서 반환하기
    static <T extends Animal> T printGeneric2(Box<T> box){
        T t = box.getValue();
        System.out.println("t.getName() = " + t.getName());
        return t;
    }

    static Animal printWildCard3(Box<? extends Animal> box){
        Animal value = box.getValue();
        System.out.println("value.getName() = " + value.getName());
        return value;
    }
}
