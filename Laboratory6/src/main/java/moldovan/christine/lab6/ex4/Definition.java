package moldovan.christine.lab6.ex4;

import java.util.HashMap;
import java.util.Objects;

public class Definition {
    private String description;

    public Definition(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Definition definition = (Definition) obj;
        return Objects.equals(description, definition.description);
    }
}
