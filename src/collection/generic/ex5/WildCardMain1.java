package collection.generic.ex5;

import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("멍멍이",100));

        WildCardEx.printGeneric1(dogBox);
        WildCardEx.printWildCard(dogBox);

        WildCardEx.printGenericV1(dogBox);

        Dog dog = WildCardEx.printGeneric2(dogBox);

    }
}
