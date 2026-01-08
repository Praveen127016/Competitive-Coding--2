import java.util.ArrayList;

class BagOfNumbers {
    private ArrayList<Integer> bag;

    public BagOfNumbers() {
        bag = new ArrayList<>();
    }

    public void add(int num) {
        bag.add(num);
    }

    public boolean remove(int num) {
        return bag.remove(Integer.valueOf(num)); // removes one occurrence
    }

    public int size() {
        return bag.size();
    }

    public boolean isEmpty() {
        return bag.isEmpty();
    }

    public void display() {
        System.out.println("Bag contents: " + bag);
    }

    public static void main(String[] args) {
        BagOfNumbers bag = new BagOfNumbers();
        bag.add(10);
        bag.add(20);
        bag.add(10);
        bag.add(30);

        bag.display();
        System.out.println("Size: " + bag.size());

        bag.remove(10);
        bag.display();
        System.out.println("Is Empty? " + bag.isEmpty());
    }
}
