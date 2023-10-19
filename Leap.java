package stack;
import java.util.*;
public class Leap { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YEAR");
        int n= sc.nextInt();
        if((n%4==0)|| (n%100==0))
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("NOT LEAP");
        }

        
    }
    
}
