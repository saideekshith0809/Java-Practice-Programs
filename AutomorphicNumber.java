import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int sq=n*n;

        int digits= (n==0)?1:(int)Math.log10(n)+1;

        int  mod=(int)Math.pow(10,digits);

        if(sq%mod==n)
        System.out.print("Yes");
        else
            System.out.print("No");
    }
}
