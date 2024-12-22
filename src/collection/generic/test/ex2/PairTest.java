package collection.generic.test.ex2;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer,String> pair1 = new Pair<>();
        pair1.setFirst(1);
        pair1.setSecond("data");
        System.out.println("pair1.getFirst() = " + pair1.getFirst());
        System.out.println("pair1.getSecond() = " + pair1.getSecond());
        System.out.println("pair1 = " + pair1);

        Pair<String,String> pair2 = new Pair<>();
        pair2.setFirst("key");
        pair2.setFirst("value");
        System.out.println("pair2.getFirst() = " + pair2.getFirst());
        System.out.println("pair2.getSecond() = " + pair2.getSecond());
        System.out.println("pair2 = " + pair2);


    }
}
