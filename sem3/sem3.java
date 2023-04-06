package sem3;

/**
 * sem3 HW
 */
public class sem3 {

    public static void main(String[] args) {

        MylinkedList list1 = new MylinkedList();
        list1.addEnd(1);
        list1.addEnd(3);
        list1.addEnd(6);
        list1.addEnd(43);
        list1.addEnd(331);
        list1.addEnd(765);
        list1.addEnd(788);
        list1.addEnd(967);
        list1.addEnd(999);
        list1.addFirst(-127);
        list1.addFirst(-235);
        list1.addFirst(-345);
        list1.addFirst(-567);
        System.out.println(list1.toString());
        MylinkedList reveseList = MylinkedList.reverse(list1);
        System.out.println(reveseList.toString());
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

    public void addEnd(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
        } else {
            searchEnd().setNext(node);
        }
    }

    public void addFirst(int value) {
        Node addNode = new Node(value);
        addNode.setNext(head);
        head = addNode;
    }

    public static MylinkedList reverse(MylinkedList mylinkedList) {
        MylinkedList result = new MylinkedList();
        Node temp = mylinkedList.head;
        while (true) {
            if (temp.getNext() != null) {
                result.addFirst(temp.getValue());
                temp = temp.getNext();
            } else {
                result.addFirst(temp.getValue());
                return result;
            }
        }
    }

    public static MylinkedList copy(MylinkedList mylinkedList) {
        if (mylinkedList == null) {
            return null;
        }

        MylinkedList result = new MylinkedList();

        Node temp = mylinkedList.head;

        while (true) {
            if (temp.getNext() != null) {
                result.addEnd(temp.getValue());
                temp = temp.getNext();
            } else {
                result.addEnd(temp.getValue());
                return result;
            }
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