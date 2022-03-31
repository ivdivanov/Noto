import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DoublyLinkedListTest {

    DoublyLinkedList<String, String> linkedListTest = new DoublyLinkedList<>();
    Node<String, String> test1 = new Node<>("test1 Key", "test Value");
    Node<String, String> test2 = new Node<>("test2 Key", "test Value");
    Node<String, String> test3 = new Node<>("test3 Key", "test Value");
    Node<String, String> test4 = new Node<>("test4 Key", "test Value");
    Node<String, String> test5 = new Node<>("test5 Key", "test Value");
    Node<String, String> test6 = new Node<>("test6 Key", "test Value");
    Node<String, String> test7 = new Node<>("test7 Key", "test Value");

    @Test
    public void checkIfAddedOnTopOfList() {
        linkedListTest.addFirst(test1);
        assertEquals(linkedListTest.getFirst(), test1);
        linkedListTest.addFirst(test2);
        assertEquals(linkedListTest.getFirst(), test2);
        linkedListTest.addFirst(test2);
        assertEquals(linkedListTest.getFirst(), test2);
        assertEquals(test2.getNext(), test2);

    }

    @Test
    public void removeLastElementTest() {
        DoublyLinkedList<String, String> linkedListTest = new DoublyLinkedList<>();
        linkedListTest.addFirst(test5);
        linkedListTest.addFirst(test6);
        linkedListTest.addFirst(test7);
        assertEquals(linkedListTest.getLast(), test5);
        linkedListTest.removeLast();
        assertEquals(linkedListTest.getLast(), test6);
        linkedListTest.removeLast();
        assertEquals(linkedListTest.getLast(), test7);

    }

    @Test
    public void removeFirstElementTest() {
        DoublyLinkedList<String, String> linkedListTest = new DoublyLinkedList<>();
        linkedListTest.addFirst(test1);
        linkedListTest.addFirst(test2);
        linkedListTest.addFirst(test3);
        linkedListTest.addFirst(test4);
        assertEquals(linkedListTest.getFirst(), test4);
        linkedListTest.removeFirst();
        assertEquals(linkedListTest.getFirst(), test3);
        linkedListTest.removeFirst();
        assertEquals(linkedListTest.getFirst(), test2);

    }

    @Test
    public void removeFromTheMidAndAddOnTop() {
        DoublyLinkedList<String, String> linkedListTest = new DoublyLinkedList<>();
        linkedListTest.addFirst(test1);
        linkedListTest.addFirst(test2);
        linkedListTest.addFirst(test3);
        linkedListTest.addFirst(test4);
        assertEquals(linkedListTest.getFirst(), test4);
        Node test5 = linkedListTest.RemoveFromCurrPositionToBeMovedOnTop(test3);
        linkedListTest.addFirst(test5);
        assertNull(test5.getPrev());
        assertEquals(test5.getNext(), test4);
        assertEquals(test4.getNext(), test2);
        assertEquals(test4.getPrev(), test5);
        assertEquals(test2.getPrev(), test4);
        assertEquals(linkedListTest.getFirst(), test5);

    }

    @Test
    public void removeFromTheEndAndAddOnTop() {
        DoublyLinkedList<String, String> linkedListTest = new DoublyLinkedList<>();
        linkedListTest.addFirst(test1);
        linkedListTest.addFirst(test2);
        assertEquals(linkedListTest.getFirst(), test2);
        Node test5 = linkedListTest.RemoveFromCurrPositionToBeMovedOnTop(test1);
        linkedListTest.addFirst(test5);
        assertEquals(linkedListTest.getFirst(), test5);
        assertEquals(linkedListTest.getLast(), test2);
        assertNull(test5.getPrev(), null);
        assertEquals(test5.getNext(), test2);
        assertEquals(test2.getPrev(), test5);
        assertNull(test2.getNext(), null);
    }

    @Test
    public void removeFromTheTopAndAddOnTop() {
        DoublyLinkedList<String, String> linkedListTestrFt = new DoublyLinkedList<>();
        linkedListTestrFt.addFirst(test6);
        linkedListTestrFt.addFirst(test7);
        assertEquals(linkedListTestrFt.getFirst(), test7);
        Node test8 = linkedListTestrFt.RemoveFromCurrPositionToBeMovedOnTop(test7);
        linkedListTestrFt.addFirst(test8);
        assertEquals(linkedListTestrFt.getFirst(), test8);
        assertNull(test8.getPrev(), null);
        assertEquals(linkedListTestrFt.getFirst(), test8);
        assertEquals(test8.getNext(), test6);
        assertNull(test6.getNext(), null);
        assertEquals(linkedListTestrFt.getLast(), test6);
        assertEquals(test6.getPrev(), test8);

    }

    @Test
    public void displayAllElementsFromTheList() {
        DoublyLinkedList<String, String> linkedListTestdis = new DoublyLinkedList<>();
        linkedListTestdis.addFirst(test1);
        linkedListTestdis.addFirst(test2);
        linkedListTestdis.addFirst(test3);
        linkedListTestdis.addFirst(test4);
        linkedListTestdis.displayElements();
        int index = 4;
        Node curr = linkedListTestdis.getFirst();
        while (true) {
            assertEquals("test" + (index) + " Key", curr.getKey());
            curr = curr.getNext();
            index--;
            if (curr.getNext() == null) {
                break;
            }
        }
    }
}
