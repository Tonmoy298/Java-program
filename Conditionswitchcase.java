
package conditionswitchcase;

import java.util.*;
public class Conditionswitchcase {

    public static void main(String[] args) {
       
     Scanner obj=new Scanner (System.in);
     System.out.println("Enter the button number");
      int button=obj.nextInt();
      
      switch(button){
          case 1: System.out.println("Hello");
          break;
           case 2: System.out.println("java");
          break;
           case 3: System.out.println("C");
          break;
           case 4: System.out.println("C++");
          break;
           case 5: System.out.println("Sql");
          break;
           case 6: System.out.println("C#");
          break;
          
   
      }  
    }
    
}
