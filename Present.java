//problem here-> https://codeforces.com/contest/136/problem/A

import java.util.Scanner;

public class Present {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();   
        }
        for(int i=1; i<=n; i++){
            for(int j=0; j<n; j++){
                if(arr[j]==i) System.out.print(j+1+" "); 
            }
        }
        sc.close();
    }    
}
