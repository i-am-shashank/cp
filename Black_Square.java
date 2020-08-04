import java.util.Scanner;

//problem here -> https://codeforces.com/contest/431/problem/A

public class Black_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0; i<4; i++){
            arr[i]= sc.nextInt();
        }
        String str = sc.next();
        char nu_arr[] = str.toCharArray();
        int sum=0;
        for(int i =0; i< nu_arr.length; i++){
            for(int j=1; j<=4; j++){
                if(Character.getNumericValue(nu_arr[i])==j){
                    sum+=arr[j-1];
                }
            }
        }
        sc.close();
        System.out.println(sum);
    }
}