
package evenoddcheak;
import java.util.*;
public class EvenoddCheak {

    
    public static void main(String[] args) {
     Scanner obj=new Scanner (System.in) ;
     System.out.println("Enter intiger number: ");
      int number =obj.nextInt();
      
      if(number%2==0){  
          System.out.println("Even ");
      }else{
       System.out.println("Odd "); 
      }
    
    }
    
}
