package collection.set.test;

import java.util.Objects;

public class Ractangle {
    private int width;
    private int height;

    public Ractangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ractangle ractangle = (Ractangle) o;
        return width == ractangle.width && height == ractangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Ractangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
