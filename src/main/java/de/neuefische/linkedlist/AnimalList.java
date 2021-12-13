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
