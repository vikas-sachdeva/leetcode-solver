package solver;

public class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;

    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < size) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.val;
        } else {
            return -1;
        }
    }

    public void addAtHead(int val) {
        head = new Node(val, head);
        size++;
    }

    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(val, null);
            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else if (index < size) {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node(val, temp.next);
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < size) {
            if (index == 0) {
                deleteAtHead();
            } else {
                Node temp = head;
                for (int i = 1; i < index; i++) {
                    temp = temp.next;
                }
                if (temp.next != null) {
                    temp.next = temp.next.next;
                }
            }
            size--;
        }
    }

    private void deleteAtHead() {
        head = head.next;
    }
}
