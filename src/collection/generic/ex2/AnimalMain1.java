package collection.generic.ex2;

import collection.generic.animal.Animal;
import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물",0);
        Dog dog = new Dog("강아지", 100);
        Cat cat = new Cat("고양이",50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);


        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
