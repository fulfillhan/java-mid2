package collection.generic.test.ex3;

import collection.generic.test.ex3.Shuttle;
import collection.generic.test.ex3.unit.Biounit;

public class UnitPrinter {

    static <T extends Biounit> void printV1(Shuttle<T> t1){
        T unit = t1.out();
        System.out.print("이름 = " + unit.getName());
        System.out.println(", HP = " + unit.getHp());
    }

    static void printV2(Shuttle<?> shuttle){
        shuttle.showInfo();
    }
}
