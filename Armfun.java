package stack;
import java.util.*;
public class Armfun {
    static int findlength(int num){
        int count=0;
    while(num!=0){
        num=num/10;
        count +=1;
    } return(count);
    }
    static int findpower(int base,int exp){
        int result=1;
        int power=exp;
        while(power!=0){
            result=result*base;
            power--;
        }
        return(result);
    }
    static void isArmstrong(int num){
        int numcopy=num;
        int ss=0;
        int numberlength=findlength(numcopy);
        while(num!=0){
        int s=num%10;
        ss=ss+findpower(s,numberlength);
        num=num/10;
    }if(numcopy==ss){
        System.out.println("ARMSTRONG");
    } else {
        System.out.println("Not ARMSTRONG");
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NO.:");
        int n=sc.nextInt();
        isArmstrong(n);
    }
    
}
