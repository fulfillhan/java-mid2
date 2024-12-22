package collection.generic.ex4;

import collection.generic.animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    //제네릭타입보다 제네릭 메서드가 우선순위를 갖는다.
    //다음의 메서드는 모호하다 -> 안좋은 메서드
/*
    public <T> T printAndReturn (T z){  //매개변수의 T는 반환 T와 같다 -> 어떤게 들어올지 몰라서 Object
        System.out.println("animal className = "+animal.getClass().getName());
        System.out.println("t className = "+z.getClass().getName());
        return z;
    }
*/

    public <Z> Z printAndReturn (Z z){  //매개변수의 T는 반환 T와 같다 -> 어떤게 들어올지 몰라서 Object
        System.out.println("animal className = "+animal.getClass().getName());
        System.out.println("t className = "+z.getClass().getName());
        return z;
    }


}
