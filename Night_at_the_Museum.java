//problem here-> https://codeforces.com/contest/731/problem/A

import java.util.Scanner;

public class Night_at_the_Museum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l=0, total=0;
        char prevChar='a';
        for(int i =0; i<str.length(); i++ ){
            l=0;
            if(prevChar<str.charAt(i)){
                for(char j =prevChar; j<str.charAt(i); j++){
                    l++;
                }
            }else{
                for(char j =str.charAt(i); j<prevChar; j++){
                    l++;
                }
            }
            prevChar=str.charAt(i);
            total+= (l<26-l)? l: 26-l;
        }
        System.out.println(total);
        sc.close();
    }
}