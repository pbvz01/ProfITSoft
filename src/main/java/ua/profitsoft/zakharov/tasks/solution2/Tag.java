package ua.profitsoft.zakharov.tasks.solution2;

import java.util.Objects;

public class Tag {
    private String name;
    private Long reference;

    public Tag(String name, Long reference) {
        this.name = name;
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Tag {" +
                "name='" + name + '\'' +
                ", reference=" + reference +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return reference.equals(tag.reference) && name.equals(tag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, reference);
    }
}
