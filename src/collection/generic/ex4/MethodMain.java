package collection.generic.ex4;

public class MethodMain {
    public static void main(String[] args) {
        Integer i = 10;
        Integer result1 = (Integer) GenericMethod.objMethod(i);  //타입개스팅 필요
        System.out.println("result1 = " + result1);


        //타입 인자에 명시적인 전달
        Integer result2 = GenericMethod.genericMethod(i);
        System.out.println("result2 = " + result2);
        Integer result3 = GenericMethod.numberMethod(10);
        Double result4 = GenericMethod.numberMethod(10.0);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

    }
}
