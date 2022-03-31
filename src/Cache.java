import java.util.HashMap;

public class Cache <K,T>{

    HashMap <K, Node<K,T>> map = new HashMap<>();
    DoublyLinkedList <K,T> liknedList = new DoublyLinkedList<>();
    int capacity;

    public Cache(int capacity) {
        this.capacity = capacity;
    }

    public T get(K key) {
        Node <K,T>n = map.get(key);
        if (n != null) {
            Node<K,T>curr = this.liknedList.RemoveFromCurrPositionToBeMovedOnTop(n);
            this.liknedList.addFirst(curr);
            return n.getValue();
        }
        return null;

    }

    public void putInCache(K key, T value) {
        if (map.containsKey(key)) {
            Node existingNode = this.map.get(key);
            existingNode.setValue(value);
            this.liknedList.RemoveFromCurrPositionToBeMovedOnTop(existingNode);
            this.liknedList.addFirst(existingNode);
        }else {
            Node<K,T>n = new Node<>(key, value);
            this.map.put(key,n);
            addToLinkedList(n);
            this.liknedList.RemoveFromCurrPositionToBeMovedOnTop(n);
            this.liknedList.addFirst(n);
            removeOverCapacityFoods();
        }
    }

    private void addToLinkedList(Node <K,T>node){
        this.liknedList.addFirst(node);
    }


    private void removeOverCapacityFoods() {
        if (map.size() > this.capacity) {
            Node <K,T>curr = this.liknedList.removeLast();
            map.remove(curr.getKey());
        }
    }


    public void displayElementsFromTheList() {
        this.liknedList.displayElements();
    }

    public int currCapacity() {
        return this.map.size();
    }


}
