package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    void testToStringEmptyList() {
        //GIVEN
        AnimalList list = new AnimalList();

        //WHEN
        String actual = list.toString();

        //THEN
        assertEquals("List is empty!", actual);
    }

    @Test
    void testAddFirstItem() {
        //GIVEN
        AnimalList list = new AnimalList();
        Animal animal = new Animal("Hund");
        //WHEN
        list.add(animal);
        //THEN
        assertEquals("Hund", list.toString());
    }

    @Test
    void testAddItem() {
        //GIVEN
        AnimalList list = new AnimalList();
        Animal animal1 = new Animal("Hund");
        Animal animal2 = new Animal("Katze");
        list.add(animal1);
        //WHEN
        list.add(animal2);
        //THEN
        assertEquals("Hund -> Katze", list.toString());
    }

    @Test
    void testRemoveFirstElement() {
        //GIVEN
        AnimalList list = new AnimalList();
        Animal animal1 = new Animal("Hund");
        Animal animal2 = new Animal("Katze");
        list.add(animal1);
        list.add(animal2);
        //WHEN
        list.remove(animal1);
        //THEN
        assertEquals("Katze", list.toString());
    }

    @Test
    void testRemoveLastElement() {
        //GIVEN
        AnimalList list = new AnimalList();
        Animal animal1 = new Animal("Hund");
        Animal animal2 = new Animal("Katze");
        list.add(animal1);
        list.add(animal2);
        //WHEN
        list.remove(animal2);
        //THEN
        assertEquals("Hund", list.toString());
    }

    @Test
    void testRemoveMiddleElement() {
        //GIVEN
        AnimalList list = new AnimalList();
        Animal animal1 = new Animal("Hund");
        Animal animal2 = new Animal("Katze");
        Animal animal3 = new Animal("Tiger");
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
        //WHEN
        list.remove(animal2);
        //THEN
        assertEquals("Hund -> Tiger", list.toString());
    }

    @Test
    void testRemoveNotExistingElement() {
        //GIVEN
        AnimalList list = new AnimalList();
        Animal animal1 = new Animal("Hund");

        //WHEN
        list.remove(animal1);
        //THEN
        assertEquals("List is empty!", list.toString());
    }

    @Test
    void testRemoveMultipleElement() {
        //GIVEN
        AnimalList list = new AnimalList();
        Animal animal1 = new Animal("Hund");
        Animal animal2 = new Animal("Hund");

        list.add(animal1);
        list.add(animal2);

        //WHEN
        list.remove(animal1);
        //THEN
        assertEquals("List is empty!", list.toString());
    }
}