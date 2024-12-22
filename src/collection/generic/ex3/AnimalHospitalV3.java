package collection.generic.ex3;

import collection.generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { // 타입 매개변수의 제한
    // Animal 의 자식들만 들어올 수 있다.

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    //static 제네릭 메서드 - 제네릭을 반환하는 메서드
    public static <T> T genericMethod(T animal){

        return animal;
    }

    public  void checkUp(){
       //Animal 의 기능을 사용할 수 있다.
        System.out.println("animal.getName() = " + animal.getName());
        System.out.println("animal.getSize() = " + animal.getSize());
        animal.sound();
    }

    public Animal getBigger(Animal target){
        return animal.getSize() > target.getSize() ? animal : target;

    }
}
