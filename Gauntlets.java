import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),pairs=0;
        int [] f=new int[1001];

        for(int i=0;i<n;i++) f[sc.nextInt()]++;
        for(int i=0;i<1000;i++) pairs+=f[i]/2;
         System.out.print(pairs);

    }
}
