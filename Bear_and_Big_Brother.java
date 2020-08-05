//problem here-> http://codeforces.com/contest/791/problem/A

import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        int b= sc.nextInt();
        int years =0;
        while(l<=b){
            l*=3;
            b*=2;
            years++;
        }
        System.out.println(years);
        sc.close();
    }
}