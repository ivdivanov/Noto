public class DoublyLinkedList <K,T> {

    private Node <K,T>first;
    private Node <K,T>last;

    public void addFirst(Node <K,T>node) {

        if (first == null) {
            this.first = node;
            this.last = node;
        } else {
            node.setNext(this.first);
            this.first.setPrev(node);
            this.first = node;
        }
    }

    public void removeFirst() {
        if (this.first == null) {
            System.out.println("There are no items to remove");
        }
        if (this.first == this.last) {
            this.first = null;
            this.last = null;
            return;
        }
        Node <K,T>second = this.first.getNext();
        this.first.setNext(null);
        this.first = second;
        second.setPrev(null);
    }

    public Node <K,T>removeLast() {
        if (this.last == null) {
            System.out.println("There are no items to remove");
        }
        if (first == last) {
            this.first = null;
            this.last = null;
            return null;
        }
        Node <K,T>previous = last.getPrev();
        this.last.setPrev(null);
        Node <K,T>theRemovedNode = this.last;
        this.last = previous;
        this.last.setNext(null);

        return theRemovedNode;
    }

    public Node <K,T> RemoveFromCurrPositionToBeMovedOnTop(Node <K,T>node) {

        if (this.first == node) {
            removeFirst();
            return node;
        } else if (this.last == node) {
            return removeLast();
        } else {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            node.setNext(null);
            node.setPrev(null);
            return node;
        }
    }

    public void displayElements() {
        if (first != null) {
            Node curr = first;
            while(true) {

                System.out.println(curr.getKey());
                if (curr.getNext() == null) {
                    break;
                }else {
                    curr = curr.getNext();
                }
            }
        }else {
            System.out.println("No elements are added in the list");
        }
    }




}
