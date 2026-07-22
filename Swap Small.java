import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

            for(int i=0;i<n;i++){
                for(int j=0;j<n-1;j++){
                    if(a[j]>a[j+1]&&a[j]+a[j+1]<=2){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }

            for(int i=0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}
