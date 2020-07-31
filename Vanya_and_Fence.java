// problem here-> https://codeforces.com/contest/677/problem/A

import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int width = 0;
        int arr[] = new int[n];
        
        for(int i =0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        
        for (int i : arr) {
            if (i<=h){
                width++;
            }        
            else{
                width = width+2;
            }     
        }
        System.out.println(width);
        sc.close();
    }
}