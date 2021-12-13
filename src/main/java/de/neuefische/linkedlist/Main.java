package de.neuefische.linkedlist;

public class Main {

    public static void main(String[] args) {
        AnimalList list = new AnimalList();

        System.out.println(list);

        list.add(new Animal("Hund"));

        System.out.println(list);

        list.add(new Animal("Katze"));

        System.out.println(list);
    }
}
