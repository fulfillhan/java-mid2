package collection.generic.ex3;


import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class AnimalHospitalV1Main {
    public static void main(String[] args) {
        // 다형성을 이용해 처리할 수 있지만
        //타입의 안정성이 없고
        //타입을 캐스팅해야 하는 번거로움
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 200);

        //개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        //고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkUp();

        //문제1: 개 변원에 고양이 전달
        dogHospital.setAnimal(cat);  //오류 발생하지 않음

        //문제2 : 개 타입 반환-> 캐스팅 필요
        dogHospital.setAnimal(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
