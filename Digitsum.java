package stack;
import java.util.*;
public class Digitsum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER DIGIT:");
        int n=sc.nextInt();
        int digit=0;
        int sum =0;
        while(n>0){
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("SUM OF DIGIT:"+sum);
    }
    
}
