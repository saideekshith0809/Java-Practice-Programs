import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        int a[][]= new int[n][n];
        for(int j=0;j<n;j++){
            for(int i=j;i<n;i++){
                a[i][j]=num;
                num++;
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a[i][j]);
                if(j!=i){
                    System.out.print(" ");
                }

            }
            System.out.println("");
         }



    }
}
