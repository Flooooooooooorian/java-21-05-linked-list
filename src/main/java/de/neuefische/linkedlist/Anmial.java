package de.neuefische.linkedlist;

import java.util.Objects;

public class Anmial {

    private String name;

    public Anmial(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anmial anmial = (Anmial) o;
        return Objects.equals(name, anmial.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Anmial{" +
                "name='" + name + '\'' +
                '}';
    }
}
