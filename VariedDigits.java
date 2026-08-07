import java.io.*;
import java.util.*;
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		    int first=x%10;
		    int last=x/10;
		if(first==last){
		    System.out.println("No");
		}
		else{
		    System.out.println("Yes");
		}

	}
}
