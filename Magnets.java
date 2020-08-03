import java.util.Scanner;

//problem here-> https://codeforces.com/contest/344/problem/A

public class Magnets {
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }    
        sc.close();
        int blocks= 1;
        for(int i=0; i<n-1; i++){
               if(arr[i]!=arr[i+1])
                blocks++;
        }
        System.out.println(blocks);
    }
}
