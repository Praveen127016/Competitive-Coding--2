import java.util.HashSet;

// Remove duplicates
public void removeDuplicates() {
    if (head == null) return;

    HashSet<Integer> seen = new HashSet<>();
    Node temp = head;
    seen.add(temp.data);

    while (temp.next != null) {
        if (seen.contains(temp.next.data)) {
            temp.next = temp.next.next; // skip duplicate
        } else {
            seen.add(temp.next.data);
            temp = temp.next;
        }
    }
}

