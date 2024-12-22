package collection.map.test.cart;

import java.util.Objects;

public class Product {

    private String fruit;
    private int money;

    public Product(String fruit, int money) {
        this.fruit = fruit;
        this.money = money;
    }

    public String getFruit() {
        return fruit;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "fruit='" + fruit + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return money == product.money && Objects.equals(fruit, product.fruit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruit, money);
    }
}
