package stack;

import java.util.Scanner;

public class MenuDriven {public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
          
    while(true){
        System.out.print("ENTER 1st NUMBER:");
      int a=sc.nextInt();
       System.out.print("ENTER 2nd NUMBER:");
      int b=sc.nextInt();
        System.out.println("PRESS 1 FOR  MULTIPLICATION");
        System.out.println("PRESS 2 FOR  ADDITION");
        System.out.println("PRESS 3 FOR  SUBSTRACTION");
        System.out.println("PRESS 4 FOR DIVISION");

      int n =sc.nextInt();
      
      switch(n)
      { case 1:{
           System.out.println("MULTIPLICATION :"+a*b);
           break;
      }
      case 2:{
        System.out.println("ADDITION:"+ (a+b));
        
        
        break;

      }
      case 3:{
        System.out.println("SUBSTRACTION:"+(a-b));
        
        
        break;

      }
      case 4:
      { System.out.println("DIVISION:"+(a/b));
       break;
    }
      
      default:
      {
        System.out.println("INVALID OPTION:");
      }


      }
     System.out.println("PRESS 1 FOR EXIT OTHERWISE KUCH BHI PRESS KAR:");
     int q=sc.nextInt();
     if(q==1){
      System.exit(0);
     }
     else{
        System.out.println("INVALID CHIOCE");
     }
    }
}}


