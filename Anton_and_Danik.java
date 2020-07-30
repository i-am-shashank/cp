
//problem here-> https://codeforces.com/contest/734/problem/A
import java.util.Scanner;

public class Anton_and_Danik{
    public static void main(String[] args) {
        int ctrA= 0;
        int ctrB= 0;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        for(int i =0 ; i<str.length(); i++){
            if(str.charAt(i)=='A') ctrA++;
            else if(str.charAt(i)=='D') ctrB++;
        }
        String res="Friendship";
        if(ctrA>ctrB) res="Anton"; 
        else if(ctrA<ctrB) res="Danik";
        else res="Friendship";
        sc.close();
        System.out.print(res);
    }
}