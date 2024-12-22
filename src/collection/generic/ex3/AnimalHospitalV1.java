package collection.generic.ex3;

import collection.generic.animal.Animal;

public class AnimalHospitalV1 {

    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public  void checkUp(){
        System.out.println("animal.getName() = " + animal.getName());
        System.out.println("animal.getSize() = " + animal.getSize());
        animal.sound();
    }

    public Animal getBigger(Animal target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
