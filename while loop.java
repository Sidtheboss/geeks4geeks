import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      
            
            
             Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       scan.close();
       int i=10;
       while(i>=1){
           System.out.print(n*i+" ");
           i--;
        
        }
    }
}
