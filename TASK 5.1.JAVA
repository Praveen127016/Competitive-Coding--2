class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Insertion Sort
    public void insertionSort() {
        Node sorted = null; 
        Node current = head;

        while (current != null) {
            Node next = current.next;
            sorted = sortedInsert(sorted, current);
            current = next;
        }
        head = sorted;
    }

    private Node sortedInsert(Node sorted, Node newNode) {
        if (sorted == null || sorted.data >= newNode.data) {
            newNode.next = sorted;
            return newNode;
        } else {
            Node temp = sorted;
            while (temp.next != null && temp.next.data < newNode.data) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            return sorted;
        }
    }

    // Print list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Test
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(30);
        list.insert(10);
        list.insert(50);
        list.insert(20);
        list.insert(40);

        System.out.println("Original List:");
        list.display();

        list.insertionSort();
        System.out.println("Sorted List:");
        list.display();
    }
}
