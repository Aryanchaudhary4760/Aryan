package apnikaksha;
import java.util.*;
public class Numpramid {
    
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("ENTER NO. OF ROWS:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
