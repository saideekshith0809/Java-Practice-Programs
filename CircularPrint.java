import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt(),arr[]=new int[n];;

        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();

        for(int i=k;i<n;i++) System.out.print(arr[i]+ " "); 
        for(int i=0;i<k;i++)System.out.print(arr[i]+ " ");
    }
}
