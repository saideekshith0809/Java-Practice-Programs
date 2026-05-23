import java.io.*;
import java.util.*;
class Asc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of names:");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] str = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine(); 
        }

        // Sorting in ascending order
        Arrays.sort(str);

        System.out.println("The sorted names are:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

        sc.close();
    }
}
