import java.util.*;

public class IntervalListIntersections {

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            // Find overlap between A[i] and B[j]
            int start = Math.max(A[i][0], B[j][0]);
            int end = Math.min(A[i][1], B[j][1]);

            if (start <= end) {
                result.add(new int[]{start, end});
            }

            // Move the pointer with the smaller end time
            if (A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    // Testing
    public static void main(String[] args) {
        int[][] A = {{0,2},{5,10},{13,23},{24,25}};
        int[][] B = {{1,5},{8,12},{15,24},{25,26}};
        
        int[][] intersections = intervalIntersection(A, B);
        
        System.out.print("Intersections: ");
        for (int[] interval : intersections) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
    }
}
