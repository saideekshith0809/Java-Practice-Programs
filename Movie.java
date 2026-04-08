import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0){
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        
	        int combos = Math.min(N, M);
	        
	        int cost = combos * C 
	                 + (N - combos) * A 
	                 + (M - combos) * B;
	        
	        System.out.println(cost);
	    }
	}
}
