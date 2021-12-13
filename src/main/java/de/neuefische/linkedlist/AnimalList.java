package de.neuefische.linkedlist;

public class AnimalList {
    private AnimalListItem head;


    public void add(Animal animal) {
        if (head == null) {
            head = new AnimalListItem(animal);
        }
        else {
            AnimalListItem current = head;

            while(current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(new AnimalListItem(animal));
        }
    }

    public void remove(Animal animal) {
        while(head != null && head.getValue().equals(animal)) {
            head = head.getNext();
        }

        if ( head == null) {
            return;
        }

        AnimalListItem current = head;

        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(animal)) {
                current.setNext(current.getNext().getNext());
            }
            else {
                current = current.getNext();
            }
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "List ist leer!";
        }

        StringBuilder builder = new StringBuilder(head.toString());

        AnimalListItem current = head.getNext();

        while (current != null) {
            builder.append(" -> ").append(current);
            current = current.getNext();
        }

        return builder.toString();
    }
}
