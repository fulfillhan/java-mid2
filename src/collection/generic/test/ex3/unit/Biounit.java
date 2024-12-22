package collection.generic.test.ex3.unit;

public class Biounit {
    private String name;
    private int hp;

    public Biounit(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Biounit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
