import java.util.Scanner;
//problem here -> https://codeforces.com/contest/266/problem/A

public class Stones_on_the_Table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int ctr =0;
        for(int i=0; i<n-1 ; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                ctr++;  
            }
        }
        System.out.println(ctr);
        sc.close();
    }
}