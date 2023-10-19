package stack;
import java.util.*;
public class Tempreture {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in) ;
    System.out.println("ENTER TEMPERATURE:");
    float n= sc.nextFloat();
    System.out.println("PRESS 1 FOR CELSIUS");
     System.out.println("PRESS 2 FOR FAHRENHEIT"); 
    int k = sc.nextInt();
    switch(k){
      case 1:
           {
            float a= ((n-32)*(5/9));
            System.out.print("TEMPRATURE IN CELSIUS: "+ a);
            break;
           }
      case 2:
           {
            float b= (n*9)/5+32;
            System.out.print("TEMPRATURE IN FAHRENHEIT: "+ b);
            break;
           }
        default:{
            System.out.println("WRONG SELECTION");
             
        }
    }
    }
    
}
