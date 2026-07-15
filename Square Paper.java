import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int A=sc.nextInt();
	    int B=sc.nextInt();
	    int area=1;
	    if(A>B){
	         area=B;
	    }
	    else{
	        area=A;
	    }
	    System.out.println(area*area);

	}
}

