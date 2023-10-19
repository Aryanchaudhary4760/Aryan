package apnikaksha;
import java.util.*;
public class pattern1 { public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter no.of rows:");
    int n1=sc.nextInt();
     System.out.println("Enter no.of column:");
    int n2=sc.nextInt();
    for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            if((i==0)||(i==n1-1)||(j==0)||(j==n2-1)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    
}
