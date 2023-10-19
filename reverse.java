package stack;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("ENTER NO.:");
    int n=sc.nextInt();
    int q=n;
    int r,k=0;
    while(n!=0){
        r=n%10;
        k=k*10+r;
        n=n/10;
    }
    
        System.out.println("ORIGINAL NO.IS "+q);
    
         System.out.println("REVERSE NO.  IS "+ k);               
    
        
    }
    
}
