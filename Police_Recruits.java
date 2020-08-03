//problem here-> https://codeforces.com/contest/427/problem/A

import java.util.Scanner;

public class Police_Recruits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inp=0, cop=0, unsolved=0;
        for(int i=0; i<n; i++){
            inp = sc.nextInt();
            if(inp<0 && cop==0){
                unsolved++;
            }else if(inp<0 && cop>0){
                cop--;
            }
            else if(inp>0){
                cop+=inp;
            }
            else if(cop>=10){
                cop=10;
            }
        }
        System.out.println(unsolved);
        sc.close(); 
    }
}