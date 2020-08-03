import java.util.Scanner;

// problem here-> https://codeforces.com/contest/381/problem/A

public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p1 = 0, p2 = 0, total = 0, flag = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total = total + arr[i];
        }
        sc.close();
        int higherval=0,i=0;
        while (p1+p2!=total) {
            if(arr[i]>arr[n-1]){
                higherval=arr[i];
                i++;
            } else{
                higherval=arr[n-1];
                n--;
            }

            if (flag == 0) {
                p1=p1+higherval;
                flag=1;
            } else {
                p2=p2+higherval;
                flag=0;
            }
        }
        System.out.print(p1+" "+p2);
    }
}
