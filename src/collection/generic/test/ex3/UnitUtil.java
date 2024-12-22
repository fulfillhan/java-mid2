package collection.generic.test.ex3;

import collection.generic.test.ex3.unit.Biounit;

public class UnitUtil{

    static <T extends Biounit> T maxHp(T t1,T t2){
        if(t1.getHp() > t2.getHp()){
            return t1;
        }
        else return t2;
    }
}
