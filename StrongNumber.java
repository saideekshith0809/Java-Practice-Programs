import java.io.*;
import java.util.*;

public class Main {
        static int fact(int x){
            int fact1=1;
            for(int i=1;i<=x;i++){
                fact1*=i;
            }
            return fact1;
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();

            int temp=n;
            int sum=0;

            while(n>0){
                int digit = n%10;
                sum+=fact(digit);
                n/=10;
            }
            if(sum == temp){
            System.out.print("Yes");

        }
        else{
            System.out.print("No");
        }

    }
}
