import java.util.Scanner;

//problem here -> https://codeforces.com/contest/59/problem/A

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int lc = 0;
        for (int i = 0; i < str.length(); i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                if (str.charAt(i) == j) {
                    lc++;
                }
            }
        }
        System.out.println((str.length()-lc > lc) ? str.toUpperCase() : str.toLowerCase());
        sc.close();
    }
}