package collection.generic.ex5;

import collection.generic.animal.Animal;
import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class WildCardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);
        //writeBox(dogBox);
    }
    //상위 타입까지 전달할 수 있다.
    static void writeBox(Box<? super Animal> box){
        Dog dog = new Dog("멍멍이", 100);
        box.setValue(dog);
    }
}
