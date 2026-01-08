import java.util.LinkedList;
import java.util.Queue;

class StackUsingTwoQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element into stack
    public void push(int x) {
        q1.add(x);
    }

    // Pop element from stack
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        // Leave last element in q1
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove(); // last element (stack top)

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    // Peek top element
    public int peek() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.peek(); 
        q2.add(q1.remove());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
    }
}
