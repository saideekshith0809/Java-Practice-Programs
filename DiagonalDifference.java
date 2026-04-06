import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int m,n,i,j;
        int value;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int sum1=0,sum2=0;
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    value=sc.nextInt();
                    if(i==j){
                        sum1+=value;
                    }
                    if(i+j==n-1){
                        sum2+=value;
                    }

                }
            }
            System.out.println(Math.abs(sum1-sum2));

    }
}
