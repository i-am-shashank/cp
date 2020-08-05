//problem here-> http://codeforces.com/contest/365/problem/A

import java.util.Scanner;

public class Good_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] a = new String[n];
        int flag = 0;
        int counter = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.next();
            for(int j=0;j<=k;j++){
                if(a[i].contains(String.valueOf(j))){
                    flag = 1;
                }else{
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                counter++;
            }
        }
        
        System.out.println(counter);
        sc.close();
    }
}