package skeina.ds.doublyLinkedList;

public class DoublyLinkedList<T extends Comparable<T>> {

    public static class Node<T> {
        private Node<T> prev;
        private T data;
        private Node<T> next;

        Node(T data) {
            this.data = data;
            prev = next = null;
        }

        public T getData() {
            return data;
        }
    }

    private Node<T> head;
    private Node<T> tail; // keep tail to make append O(1)
    private int size = 0;

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node<T> ptr = head; ptr != null; ptr = ptr.next) {
            sb.append(String.valueOf(ptr.data));
            if (ptr.next != null)
                sb.append("->");
        }
        return sb.toString();
    }

    // append (O(1) now) with tail approach
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public Node<T> search(T data) {
        if (data == null)
            return null;

        Node<T> ptr = head;

        while (ptr != null) {
            if (data.compareTo(ptr.data) == 0)
                return ptr;
            ptr = ptr.next;
        }

        return null;
    }

    public String reverseToString() {
        StringBuilder sb = new StringBuilder();
        for (Node<T> ptr = tail; ptr != null; ptr = ptr.prev) {
            sb.append(String.valueOf(ptr.data));
            if (ptr.prev != null)
                sb.append("->");
        }
        return sb.toString();
    }

    public void delete(T data) {
        Node<T> node = search(data);
        if (node == null) return;
        if (node.prev != null)
            node.prev.next = node.next;
        else
            head = node.next;
        if (node.next != null)
            node.next.prev = node.prev;
        else
            tail = node.prev;
        size--;

    }
}
