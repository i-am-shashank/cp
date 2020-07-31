
//problem here -> https://codeforces.com/contest/236/problem/A

import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int SIZE = str.length();    
        char name[] = new char[SIZE];

        for(int z=0; z<SIZE; z++){
            name[z]= str.charAt(z);
        }

        for(int i= 0; i<name.length; i++ ){
            for(int j= i+1; j<name.length; j++){
                if(name[i]==name[j]){
                    name[j]='0';
                }
            }
        }
        
        int total=0;
        for(int k =0 ; k<name.length; k++){
            if(name[k]!='0'){
                total++;
            }
        }
        if(total%2!=0) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
        sc.close();
    }
}