
package sumnnaturalnumber;
import java.util.*;

public class SumNnaturalnumber {

    
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in) ;
      System.out.println("Enter integer Number:");
        int n =obj.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
        
        sum=sum+i;
        
        }
       System.out.println(sum); 
    
    }
    
}
