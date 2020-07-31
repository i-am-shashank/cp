
//problem here-> https://codeforces.com/contest/228/problem/A

import java.util.Scanner;
import java.util.Arrays;
public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i = 0 ; i< 4 ; i++){
            arr[i] = sc.nextInt();
        }
        int ctr =0;
        Arrays.sort(arr);
        for(int j = 0 ; j <= 2 ; j++){
            if(arr[j]==arr[j+1]){               
                if(ctr==0){
                    ctr=ctr+2;
                }
                else ctr++;
            }
        }
        if(ctr!=0) System.out.println(ctr-1);
        else System.out.println(ctr);
        sc.close();
        }
}