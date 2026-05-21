
package stringss;
import java.util.*;
public class Stringss {

   
    public static void main(String[] args) {
     Scanner obj=new Scanner (System.in) ; 
      String firstname= obj.next();
      String lastname= obj.next();
     String fulname = firstname+ "@"+lastname;
     System.out.println(fulname.length());
     
     for(int i=0;i<fulname.length();i++){
     
      System.out.println(fulname.charAt(i));
     }   
        
    }
    
}
