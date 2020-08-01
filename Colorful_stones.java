//problem here -> https://codeforces.com/contest/265/problem/A

import java.util.Scanner;

public class Colorful_stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int step = 0;
        for(int i=0; i<t.length(); i++){
            if(s.charAt(step)==t.charAt(i)){
                step++;
            }
        }
        System.out.println(step+1);
        sc.close();
    }
}