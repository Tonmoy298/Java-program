

package com.mycompany.paramitarizedconstructor;

public class Paramitarizedconstructor {
int x;
int y;
public Paramitarizedconstructor(int a,int b){
    
 this.x=a;
 this.y=b;
    
}
    
    public static void main(String[] args) {
      Paramitarizedconstructor obj=new Paramitarizedconstructor(4,7)  ;
      
       System.out.println(obj.x);
        
       System.out.println(obj.y);
        
    }
}
