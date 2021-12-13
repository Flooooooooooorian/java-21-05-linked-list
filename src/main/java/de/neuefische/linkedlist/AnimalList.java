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


}
