public class Node <K, T> {
    private Node<K,T> next;
    private Node<K,T> prev;
    private T value;
    private K key;

    public Node(K key, T value) {
        this.value = value;
        this.key = key;
    }

    public T getValue() {
        return value;
    }
    public K getKey()  {
        return key;
    }

    public Node<K,T> getNext() {
        return next;
    }
    public Node<K,T> getPrev() {
        return prev;
    }
    public void setNext(Node<K,T> next) {
        this.next = next;
    }
    public void setPrev(Node<K,T> prev) {
        this.prev = prev;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
