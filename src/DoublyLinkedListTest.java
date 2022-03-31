import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DoublyLinkedListTest {

    DoublyLinkedList<String,String> linkedListTest = new DoublyLinkedList<>();
    Node <String, String>test = new Node<>("test Key", "test Value");
    Node <String, String>test2 = new Node<>("test2 Key", "test Value");
    Node <String, String>test3 = new Node<>("test3 Key", "test Value");
    Node <String, String>test4 = new Node<>("test4 Key", "test Value");
    Node <String, String>test5 = new Node<>("test2 Key", "test Value");
    Node <String, String>test6 = new Node<>("test3 Key", "test Value");
    Node <String, String>test7 = new Node<>("test4 Key", "test Value");

    @Test
    public void checkIfAddedOnTopOfList() {
        linkedListTest.addFirst(test);
        assertEquals(linkedListTest.getFirst(),test);
        linkedListTest.addFirst(test2);
        assertEquals(linkedListTest.getFirst(),test2);
    }
    @Test
    public void removeLastElementTest() {
        DoublyLinkedList<String,String> linkedListTest = new DoublyLinkedList<>();
        linkedListTest.addFirst(test5);
        linkedListTest.addFirst(test6);
        linkedListTest.addFirst(test7);
        assertEquals(linkedListTest.getLast(),test5);
        linkedListTest.removeLast();
        assertEquals(linkedListTest.getLast(),test6);
        linkedListTest.removeLast();
        assertEquals(linkedListTest.getLast(),test7);

    }
    @Test
    public void removeFirstElementTest() {
        DoublyLinkedList<String,String> linkedListTest = new DoublyLinkedList<>();
        linkedListTest.addFirst(test);
        linkedListTest.addFirst(test2);
        linkedListTest.addFirst(test3);
        linkedListTest.addFirst(test4);
        assertEquals(linkedListTest.getFirst(),test4);
        linkedListTest.removeFirst();
        assertEquals(linkedListTest.getFirst(),test3);
        linkedListTest.removeFirst();
        assertEquals(linkedListTest.getFirst(),test2);

    }
    @Test
    public void removeFromTheMidAndAddOnTop() {
        DoublyLinkedList<String,String> linkedListTest = new DoublyLinkedList<>();
        linkedListTest.addFirst(test);
        linkedListTest.addFirst(test2);
        linkedListTest.addFirst(test3);
        linkedListTest.addFirst(test4);
        assertEquals(linkedListTest.getFirst(),test4);
        Node test5 = linkedListTest.RemoveFromCurrPositionToBeMovedOnTop(test3);
        linkedListTest.addFirst(test5);
        assertEquals(linkedListTest.getFirst(),test5);

    }
    @Test
    public void removeFromTheEndAndAddOnTop() {
        DoublyLinkedList<String,String> linkedListTest = new DoublyLinkedList<>();
        linkedListTest.addFirst(test);
        linkedListTest.addFirst(test2);
        assertEquals(linkedListTest.getFirst(),test2);
        Node test5 = linkedListTest.RemoveFromCurrPositionToBeMovedOnTop(test);
        linkedListTest.addFirst(test5);
        assertEquals(linkedListTest.getFirst(),test5);
    }
    @Test
    public void removeFromTheTopAndAddOnTop() {
        DoublyLinkedList<String,String> linkedListTest = new DoublyLinkedList<>();
        linkedListTest.addFirst(test);
        linkedListTest.addFirst(test2);
        assertEquals(linkedListTest.getFirst(),test2);
        Node test5 = linkedListTest.RemoveFromCurrPositionToBeMovedOnTop(test2);
        linkedListTest.addFirst(test5);
        assertEquals(linkedListTest.getFirst(),test5);
    }

    @Test
    public void displayAllElementsFromTheList() {
        DoublyLinkedList<String,String> linkedListTest = new DoublyLinkedList<>();
        linkedListTest.addFirst(test);
        linkedListTest.addFirst(test2);
        linkedListTest.addFirst(test3);
        linkedListTest.addFirst(test4);
        linkedListTest.displayElements();
    }




}