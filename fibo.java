package stack;
import java.util.*;
public class fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("ENTER LIMIT:");
    int n=sc.nextInt();
    int a=0,b=1;
    int s=a+b;
    System.out.print(a +","+ b+",");
    for(int i =3;i<=n;i++){
    
       if(i!=n){
       System.out.print(s+",");
       a=b;
       b=s;
       s=a+b;
       }
       else{
        System.out.println(s);
       }
     
    }

    
}
}