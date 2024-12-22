package collection.generic.ex4;

import collection.generic.animal.Animal;
import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class AnimalMethodMain {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이",200);
        Cat cat = new Cat("고양이", 100);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog targetDog = new Dog("큰 멍멍이", 300);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
        //Dog bigger1 = AnimalMethod.getBigger(dog, cat);
    }
}
