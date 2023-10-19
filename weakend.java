package stack;
import java.util.*;
public class weakend {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENETER THE DAY NO.");
    int n= sc.nextInt();
     switch(n){
    case 1:{
        System.out.println("DAY IS SUNDAY");
        break;
    }
    case 2:{
        System.out.println("DAY IS MONDAY");
        break;
    }case 3:{
        System.out.println("DAY IS TUESDAY");
        break;
    }case 4:{
        System.out.println("DAY IS WEDNESDAY");
        break;
    }case 5:{
        System.out.println("DAY IS THURSDAY");
        break;
    }case 6:{
        System.out.println("DAY IS FRIDAY");
        break;
    }case 7:{
        System.out.println("DAY IS SATURDAY");
        break;
    }
    default:
    {
        System.out.println("INVAILD INPUT");
    }
     }

        
    }
    
}
