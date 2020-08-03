//problem here-> https://codeforces.com/contest/268/problem/A

import java.util.Scanner;

public class Games{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int team[][] = new int[n][2];
       int ctr=0;
       for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                team[i][j]=sc.nextInt();
            }
       }
       for(int k=0; k<n; k++){
           for(int l=0; l<n; l++){
                if(team[k][0]==team[l][1]){
                    ctr++;
                }
           }
       }
       System.out.println(ctr);
       sc.close();
    }
}