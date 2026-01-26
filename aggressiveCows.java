import java.util.*;

public class AggressiveCows {

    public static boolean canPlaceCows(int[] stalls, int cows, int minDist) {
        int count = 1;             
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= minDist) {
                count++;
                lastPos = stalls[i];
            }
            if (count == cows) {
                return true;
            }
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(stalls, cows, mid)) {
                ans = mid;       
                low = mid + 1;  
            } else {
                high = mid - 1;  
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   //no of Stalls
        int c = sc.nextInt();   //no of Cows
        int[] stalls = new int[n];
        for (int i = 0; i < n; i++) {
            stalls[i] = sc.nextInt();
        }

        System.out.println(aggressiveCows(stalls, c));
        sc.close();
    }
}
