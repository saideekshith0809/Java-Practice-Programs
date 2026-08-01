import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a =1;a<=t;a++){
            System.out.println("Case #"+a+":");
            int n = sc.nextInt();
            int m = sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==(n-1)/2 || j==0 || j==m-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }

    }
}
