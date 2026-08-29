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

        // Delete second node (20)
        Node temp = second;

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        // Traversal
        temp = first;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
