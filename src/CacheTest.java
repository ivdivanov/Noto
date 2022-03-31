import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class CacheTest {

    HashMap<String, Node<String, String>> testmap = new HashMap<>();
    DoublyLinkedList<String, String> testliknedList = new DoublyLinkedList<>();

    Cache<String, Node<String, String>> cacheTest = new Cache<>(2);

    Node<String, String> test1 = new Node<>("test1 Key", "test Value");
    Node<String, String> test2 = new Node<>("test2 Key", "test Value");
    Node<String, String> test3 = new Node<>("test3 Key", "test Value");
    Node<String, String> test4 = new Node<>("test4 Key", "test Value");


    @Test
    public void returnValuesFromTheCacheTest() {
        assertNull(testmap.get(test1.getKey()), null);
        assertNull(cacheTest.get(test1.getKey()), null);
        cacheTest.putInCache(test1.getKey(), test1);
        cacheTest.putInCache(test2.getKey(), test2);
        assertEquals(cacheTest.get("test1 Key"), test1);
        assertEquals(cacheTest.get("test2 Key"), test2);
        cacheTest.putInCache(test3.getKey(), test3);
        assertNull(cacheTest.get(test1.getKey()), null);
    }

    @Test
    public void capacityTest() {

        cacheTest.putInCache(test1.getKey(), test1);
        cacheTest.putInCache(test2.getKey(), test2);
        cacheTest.putInCache(test3.getKey(), test3);
        cacheTest.putInCache(test4.getKey(), test4);
        assertNull(testmap.get(test1.getKey()), null);
        assertNull(testmap.get(test2.getKey()), null);
        assertEquals(cacheTest.get("test3 Key"), test3);
        assertEquals(cacheTest.get("test4 Key"), test4);
        assertEquals(cacheTest.currCapacity(),2);

    }

    @Test
    public void currSizeTest() {
        Cache<String, Node<String, String>> cacheCapacityTest = new Cache<>(3);
        assertEquals(cacheCapacityTest.currCapacity(),0);
        cacheCapacityTest.putInCache(test1.getKey(), test1);
        assertEquals(cacheCapacityTest.currCapacity(),1);
        cacheCapacityTest.putInCache(test2.getKey(), test2);
        assertEquals(cacheCapacityTest.currCapacity(),2);
        cacheCapacityTest.putInCache(test3.getKey(), test3);
        assertEquals(cacheCapacityTest.currCapacity(),3);
        cacheCapacityTest.putInCache(test4.getKey(), test4);
        assertEquals(cacheCapacityTest.currCapacity(),3);
    }

    @Test
    public void putInCacheTest() {
        Cache<String, Node<String, String>> cacheCapacityTest = new Cache<>(4);
        cacheCapacityTest.putInCache(test1.getKey(), test1);
        cacheCapacityTest.putInCache(test2.getKey(), test2);
        cacheCapacityTest.putInCache(test3.getKey(), test3);
        cacheCapacityTest.putInCache(test4.getKey(), test4);
        assertEquals(cacheCapacityTest.get("test1 Key"), test1);
        assertEquals(cacheCapacityTest.get("test2 Key"), test2);
        assertEquals(cacheCapacityTest.get("test3 Key"), test3);
        assertEquals(cacheCapacityTest.get("test4 Key"), test4);

    }
    @Test
    public void putInAlreadyExistingKeyAndCheckIfValueIsUpdated() {
        Cache<String, Node<String, String>> cacheUpdatedValueTest = new Cache<>(3);
        cacheUpdatedValueTest.putInCache("test1 Key", test1);
        assertEquals(test1.getValue(),test1.getValue());
        Node<String,String> n = new Node<>("test1 Key","Updated value");
        cacheUpdatedValueTest.putInCache(n.getKey(), n);
        assertEquals(cacheUpdatedValueTest.get(n.getKey()).getValue(),"Updated value");

    }


}