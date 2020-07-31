
//problem here-> https://codeforces.com/contest/112/problem/A

import java.util.Scanner;

class Petya_and_String{
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine().toLowerCase();
        String b= sc.nextLine().toLowerCase();
        sc.close();
        int val= a.compareTo(b);
        if (val<0) System.out.println(-1);
        if (val>0) System.out.println(1);
        if (val==0) System.out.println(0);
    }
}