//problem here-> http://codeforces.com/contest/158/problem/A

import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n],c = 0;
		for (int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
			if(a[i]>=a[k-1] && a[i]!=0 ) 
				c++;
		}
		System.out.println(c);
        sc.close();
    }
}