package ctci.linkedList;

class Node{
    int data;
    Node next;

    public Node(int d){
        this.data = d;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    LinkedList(int data){
        this.head = new Node(data);
    }

    void appendToTail(int data){
        Node end = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = end;
    }

    void print(){
        Node temp = this.head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.appendToTail(5);
        list.appendToTail(8);
        list.appendToTail(13);
        list.appendToTail(21);

        list.print();
    }
}
