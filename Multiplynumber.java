
package multiplynumber;
import java.util.*;

public class Multiplynumber {

   
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in) ;
      System.out.println("Enter number :");
       int n=obj.nextInt();
       
       for(int i=1;i<11;i++) { 
       int multiply=n*i;    
           System.out.println(multiply); 
       }
        
        
    }
    
}
