package stack;

public class Swap {public static void main(String[] args) {
    
    int a=12;
    int b=10;
    
    System.out.println("variables before swapping");
    System.out.println(a);
    System.out.println(b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("variables after swapping");
    System.out.println(a);
    System.out.println(b);
}
    
}
