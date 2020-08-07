//problem here-> http://codeforces.com/contest/118/problem/A

import java.util.Scanner;

public class String_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        for(int i=0; i< str.length(); i++){
            char x = str.charAt(i);
            if(x!='a' && x!='o' && x!='y' && x!='e' && x!='u' && x!='i'){
                System.out.print('.');
                System.out.print(x);
            }
        }sc.close();
    }   
}