import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int count = 0;
        long prevlast = points[0][1]; // Use long to handle large numbers

        for (int i = 1; i < points.length; i++) {
            if (prevlast >= points[i][0]) {
                if (prevlast > points[i][1]) {
                    prevlast = points[i][1];
                }
            } else {
                prevlast = points[i][1];
                count++;
            }
        }

        return count + 1;
    }
}
