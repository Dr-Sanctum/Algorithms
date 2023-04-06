package sem3;

/**
 * sem3
 */
public class sem3 {

    public static void main(String[] args) {

        MylinkedList list = new MylinkedList();
        list.append(1);
        list.append(3);
        list.append(6);
        list.append(43);
        list.append(331);
        list.append(765);
        list.append(788);
        list.append(967);
        list.append(999);
        System.out.println(list.toString());
    }
}

class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}

class MylinkedList {
    private Node head;

    public void append(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
        } else {
            searchEnd().setNext(node);
        }
    }

    public Node searchEnd() {
        if (head.getNext() == null) {
            return head;
        } else {
            Node temp = head.getNext();
            while (true) {
                if (temp.getNext() != null) {
                    temp = temp.getNext();
                } else {
                    return temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        Node temp = head;
        while (true) {
            if (temp.getNext() != null) {
                builder.append(temp.getValue());
                builder.append(", ");
                temp = temp.getNext();
            } else {
                builder.append(temp.getValue());
                return builder.toString();
            }
        }
    }
}