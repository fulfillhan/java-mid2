package collection.generic.ex3;

import collection.generic.animal.Animal;

public class AnimalHospitalV2<T> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public  void checkUp(){
        //object 로 가장하고 관련된 메서드만 올 수 있다.
        animal.toString();
        animal.hashCode();
        //T 타입 메서들정의하는 시점에는 정할 수 없다.-> 컴파일 오류
//        System.out.println("animal.getName() = " + animal.getName());
//        System.out.println("animal.getSize() = " + animal.getSize());
//        animal.sound();
    }

    public Animal getBigger(Animal target){
        //컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return  null;
    }
}
