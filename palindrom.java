package stack;
import java.util.*;
public class palindrom {
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
    if(k==q){
        System.out.println("NO.IS PALINDROM");
    }
    else{
         System.out.println("NOT PALINDROM");               
    }
    }
    
}
