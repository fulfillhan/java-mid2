package collection.generic.ex3;


import collection.generic.animal.Animal;
import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class AnimalHospitalV3Main {
    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>(); //객체를 생성하는 시점에 타입은 정해진다.
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 200);

        //개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        //고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkUp();

        //문제1: 개 변원에 고양이 전달 -> dog지정
      // dogHospital.setAnimal(cat);

        //문제2 : 개 타입 반환-> 캐스팅 필요
        dogHospital.setAnimal(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

        //static 메서드 호출해보기
        Dog dog1 = AnimalHospitalV3.genericMethod(dog);
        System.out.println("dog1 = " + dog1);
    }
}
