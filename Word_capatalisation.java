//problem here-> https://codeforces.com/contest/281/problem/A

import java.util.Scanner;

public class Word_capatalisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(in.substring(0,1).toUpperCase()+in.substring(1));
        sc.close();
    }
}