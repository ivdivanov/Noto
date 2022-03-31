import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NodeTest {

    Node<String, String> test1 = new Node<>("test1 Key", "test Value");
    Node<String, String> test2 = new Node<>("test2 Key", "test Value");
    Node<String, String> test3 = new Node<>("test3 Key", "test Value");
    Node<String, String> test4 = new Node<>("test4 Key", "test Value");

    @Test
    public void getValueTest() {
        assertEquals(test1.getValue(),"test Value");
        assertEquals(test2.getValue(),"test Value");
    }

    @Test
    public void getKeyTest() {
        assertEquals(test1.getKey(),"test1 Key");
        assertEquals(test2.getKey(),"test2 Key");
    }
    @Test
    public void setValueTest(){
        test1.setValue("Cheren Machok");
        assertEquals(test1.getValue(),"Cheren Machok");
    }
    @Test
    public void nextNodeTest(){
        test1.setNext(test2);
        assertEquals(test1.getNext(),test2);
    }
    @Test
    public void prevNodeTest(){
        test2.setPrev(test1);
        assertEquals(test2.getPrev(),test1);
        test2.setPrev(null);
        assertNull(test2.getPrev(),null);
    }

}