class Node {

    int data;

    Node prev;

    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class main {

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;

        second.prev = first;
        second.next = third;

        third.prev = second;

        Node temp = first;

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;
        }
    }
}
