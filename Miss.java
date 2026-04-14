import java.util.*;

public class Miss {

    public static void main(String[] args) {
        int sum=0;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<99;i++) {
            sum+=s.nextInt();
        }
        int tot=100*101/2;
        System.out.print(tot-sum);
    }
}
