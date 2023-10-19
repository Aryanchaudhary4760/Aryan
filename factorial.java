package stack;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER DIGIT:");
    int n=sc.nextInt();
    int i,fac=1;
    for(i=1;i<=n;i++)
    {
        fac=fac*i;
    }   
    System.out.println("FACTORAIL OF "+ n+"  is  "+fac);  
    }
    
}
