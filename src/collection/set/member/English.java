package collection.set.member;

import java.util.Objects;

public class English {
    private String word;

    public English(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "English{" +
                "word='" + word + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        English english = (English) o;
        return Objects.equals(word, english.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}
