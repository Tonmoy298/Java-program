

package com.mycompany.methodoverloading;


public class Methodoverloading {
    
    public void  sum(int a, int b){
        
      System.out.println(a+b);  
    } 
     public void  sum(int a, int b,int c){    
       System.out.println(a+b+c); 
     }
     
    public static void main(String[] args) {
        
       Methodoverloading obj=new Methodoverloading ();
       obj. sum (4,6);
       obj.sum(7, 8,1);
        
    }
}
