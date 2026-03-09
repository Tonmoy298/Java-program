
package com.mycompany.constructorproblem;


public class Constructorproblem {
int x,y;
int z;
 double m;
 
 public Constructorproblem(){
    this.x=3;
     
 }
    public Constructorproblem(int a){
        
     this.x=a;
        
    }
    public Constructorproblem(int a,int b,int c){
    this.x=a;
    this.y=b;
    this.z=c;
    
    } 
    public Constructorproblem(double m){
        
        
     this.m=m;
        
        
    }
    public Constructorproblem(int a,int b){
      this.x=a;
      this.y=b;
          
    }
    public static void main(String[] args) {
        
       Constructorproblem obj=new  Constructorproblem();
       
       Constructorproblem obj1=new Constructorproblem(10);
               
         Constructorproblem obj2=new Constructorproblem(4,5,7);
          Constructorproblem obj3=new Constructorproblem(4.6);
            Constructorproblem obj4=new Constructorproblem(200,400);
                                       
             Constructorproblem obj5=new  Constructorproblem(1,7);
        
        
         System.out.println(obj.x);
         System.out.println(obj1.x);
         System.out.println(obj2.x+" "+obj2.y+" "+obj2.z);
         System.out.println(obj3.m);
        
         System.out.println( obj4.x+" "+obj4.y);
        
        System.out.println( obj5.x+" " +obj5.y);
    }
}
