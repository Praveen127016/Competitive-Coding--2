import java.util.Scanner;

public class DiskTower {
    private int[] disks;
    private boolean[] placed;
    private int n;
    private int maxDisk;

    public DiskTower(int n) {
        this.n = n;
        disks = new int[n];
        placed = new boolean[n + 1]; // index 1..n
        maxDisk = n;
    }

    public void processDisks() {
        Scanner sc = new Scanner(System.in);

        for (int day = 1; day <= n; day++) {
            System.out.print("Enter disk size for day " + day + ": ");
            int size = sc.nextInt();
            disks[day - 1] = size;
            placed[size] = true;

            System.out.print("Day " + day + " : ");
            placeDisks();
            System.out.println();
        }

        sc.close();
    }

    // Recursive placement of disks
    private void placeDisks() {
        while (maxDisk > 0 && placed[maxDisk]) {
            System.out.print(maxDisk + " ");
            maxDisk--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of disks: ");
        int n = sc.nextInt();

        DiskTower tower = new DiskTower(n);
        tower.processDisks();
    }
}
