package de.neuefische.linkedlist;

import java.util.Objects;

public class AnimalListItem {
    private Anmial value;
    private AnimalListItem next;

    public AnimalListItem(Anmial value) {
        this.value = value;
    }

    public Anmial getValue() {
        return value;
    }

    public void setValue(Anmial value) {
        this.value = value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalListItem that = (AnimalListItem) o;
        return Objects.equals(value, that.value) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }

    @Override
    public String toString() {
        return "AnimalListItem{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
