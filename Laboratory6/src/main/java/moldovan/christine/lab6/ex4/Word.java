package moldovan.christine.lab6.ex4;

import java.util.Objects;

public class Word {
    private String name;

    public Word(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Word word = (Word) obj;
        return Objects.equals(name, word.name);
    }
}
