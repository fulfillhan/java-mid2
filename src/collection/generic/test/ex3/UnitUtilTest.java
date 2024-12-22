package collection.generic.test.ex3;

import collection.generic.test.ex3.unit.Marin;
import collection.generic.test.ex3.unit.Zeolot;

public class UnitUtilTest {
    public static void main(String[] args) {
        Marin m1 = new Marin("마린1", 40);
        Marin m2 = new Marin("마린2", 50);
        Marin result = UnitUtil.maxHp(m1, m2);
        System.out.println("result = " + result);

        Zeolot z1 = new Zeolot("질럿1", 100);
        Zeolot z2 = new Zeolot("질럿2", 150);
        Zeolot result2 = UnitUtil.maxHp(z1, z2);
        System.out.println("result2 = " + result2);
    }
}
