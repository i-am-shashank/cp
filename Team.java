
// problem here -> https://codeforces.com/contest/231/problem/A

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] op = new int[n][3];

    for (int i =0 ; i< n ; i++){
        for(int j=0;j<3;j++){
            op[i][j]=sc.nextInt();
        }    
    }
    int total = 0;
    int sum = 0;
    for (int i = 0 ; i < n ; i++){
        sum = 0;
        for(int j=0;j<3;j++){
            sum += op[i][j];
        }      
        if(sum>=2){
            total++;
        }
    }
    System.out.println(total);  
    sc.close();    
    }
}