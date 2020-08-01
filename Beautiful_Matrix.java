import java.util.Scanner;

//problem here -> https://codeforces.com/contest/263/problem/A

public class Beautiful_Matrix {
    public static void main(String[] args) {
        int[][] matx= new int[5][5];    
        Scanner sc = new Scanner(System.in);
        int posi=0, posj=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                matx[i][j]=sc.nextInt();
                if(matx[i][j]==1){
                    posi=i;
                    posj=j;
                };
            }
        }
        int s1=0,s2=0;
        s1= (posi>2)? posi-2:2-posi;
        s2= (posj>2)? posj-2:2-posj;
        
        System.out.println(s1+s2);
        sc.close();

    }
}
