//problem here-> http://codeforces.com/contest/298/problem/A

import java.util.Scanner;

public class Snow_footprints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int start=0, end=0;
        for(int i=0; i<n; i++){
            if(str.contains("R")&&str.contains("L")){
                start=str.indexOf("R")+1;
                end=str.lastIndexOf("R")+1;
            }else if(str.contains("R")){
                start=str.indexOf("R")+1;
                end=str.lastIndexOf("R")+2;
            }else if(str.contains("L")){
                end=str.indexOf("L");
                start=str.lastIndexOf("L")+1;
            }
        }
        System.out.print(start+" "+end);
        sc.close();
    }
}