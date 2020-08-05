//problem here-> https://codeforces.com/contest/732/problem/A

import java.util.Scanner;

public class Buy_a_Showel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();
        int i=1;

        while ((i * p) % 10 != c && (i * p) % 10 != 0) {
            i++;
        }
        System.out.println(i);
        sc.close();
    }
}