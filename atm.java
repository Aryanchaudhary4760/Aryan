package stack;
import java.util.*;
public class atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int bal=100;        
    while(true){
        System.out.println("PRESS 1 FOR CHECK THE BALANCE");
        System.out.println("PRESS 2 FOR DEPOSITE MONEY");
        System.out.println("PRESS 3 FOR WITHDRAM MONEY");
        System.out.println("PRESS 4 FOR EXIT");
      int n =sc.nextInt();
      
    
      switch(n)
      { case 1:{
           System.out.println("YOUR AVAILABLE BALANCE IS :"+bal);
           break;
      }
      case 2:{
        System.out.println("ENTER AMOUNT TO DEPOSITE:");
        int k=sc.nextInt(); 
        bal += k;
        break;

      }
      case 3:{
        System.out.println("ENTER AMOUNT TO WITHDRAW:");
        int r=sc.nextInt(); 
        if(r>bal){
            System.out.println("INSUFICIENT MONEY :");
        }
        else{
        bal -= r;
        }
        break;

      }
      case 4:{
        System.exit(0);
      }
      default:
      {
        System.out.println("INVALID OPTION:");
      }


      }
    

   
    }
}}
