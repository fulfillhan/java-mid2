package collection.generic.test.ex3;

import collection.generic.test.ex3.unit.Biounit;

public class Shuttle <T extends Biounit> {
    //제네릭 타입

    private T unit;

    public void in(T resultUnit){
        unit=resultUnit;
    }

    public T out()
    {
        return unit;
    }

    public void showInfo(){
        System.out.println("이름 = " + unit.getName()+", HP = "+unit.getHp());
    }
}
