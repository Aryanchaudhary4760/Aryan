package stack;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1ST STRING");
        String r= sc.nextLine();
        System.out.println("ENTER 2nd STRING");
        String s= sc.nextLine();
        r=r.toLowerCase();
         s=s.toLowerCase();
        if(r.length()==s.length()){
            char[] charArray1= r.toCharArray();
             char[] charArray2= r.toCharArray();
         Arrays.sort(charArray1);
         Arrays.sort(charArray2);
         boolean k=Arrays.equals(charArray1,charArray2);
         if(k){
            System.out.println(r +" and "+s +" are anagram");
         }
         else{
            System.out.println("not anagram");
         }

        }else{
            System.out.println("not anagram");
         }

   
    }
    
}
