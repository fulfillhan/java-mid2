package collection.generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object o){
        System.out.println("o = " + o);
        return o;
    }
    public static <T> T genericMethod(T o){  //메서드안에서만 제네릭 타입 적용
        System.out.println("o = " + o);
        return o;
    }

    public static <T extends Number> T numberMethod(T t){  //메서드안에서만 제네릭 타입 적용
        System.out.println("o = " + t);
        return t;
    }
}
