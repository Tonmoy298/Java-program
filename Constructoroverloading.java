
package com.mycompany.constructoroverloading;


public class Constructoroverloading {

      int x;
       int  y;   
    public Constructoroverloading (){
       this.x=5;
       this.y=6;
        
    }
    public Constructoroverloading ( int a,int b){
        this.x=a;
       this.y=b;
    }
    public static void main(String[] args) {
        
      Constructoroverloading obj=new Constructoroverloading()  ;
      
      Constructoroverloading  obj1=new Constructoroverloading (34,7);
        
      Constructoroverloading  obj2=new Constructoroverloading (3,8) ;
        
        System.out.println(obj.x +" "+obj.y);
         System.out.println(obj1.x+" " +obj1.y);
          System.out.println(obj2.x +" " + obj2.y);
}
}