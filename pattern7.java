package apnikaksha;

public class pattern7 { public static void main(String[] args) {
    int c=2;
    for(int i=1;i<=8;i++){
        for(int j=1;j<=i;j++)
        {
            if(i<=4){
                System.out.print("*");
            }
        }
       for(int j=1;j<=8+1-i;j++)
        {
            if(i>4){
                System.out.print("*");
            }
        }
        for(int j=1;j<=8-2*i;j++)
        {
            if(i<=4)
                System.out.print(" ");
            
        }
        for(int j=1;j<=i;j++)
        {
            if(i<=4){
                System.out.print("*");
            }
        }
        for(int j=1;j<=(2*i)%10;j++)
        {
            if(i>5)
                System.out.print(" ");
            
        }
       for(int j=1;j<=8+1-i;j++)
        {
            if(i>4){
                System.out.print("*");
            }
        }
        System.out.println();
        
    }
}
    
}
