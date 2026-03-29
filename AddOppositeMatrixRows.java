import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int m,n,i,j;
        Scanner sc= new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int [][]a= new int[m][n];
        int [][]b= new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++){
            int sum=0;
            for(j=0;j<n;j++){ 
                sum+=a[i][j]+b[m-i-1][j];
            }
            System.out.println(sum);
        }
    }    
}
