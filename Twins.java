
//problem here-> http://codeforces.com/contest/160/problem/A

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);
        int ctr=0, sum_new = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum_new += arr[i];
            ctr++;
            if (sum_new > sum / 2) {
                System.out.println(ctr);
                break;
            }
        }
        sc.close();
    }
}