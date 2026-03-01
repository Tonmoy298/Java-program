
package com.mycompany.objectmethod;

public class Objectmethod {
    public static int max(int x,int y){
    
    if(x>y){
        return x;
    }
    else{
        return y;
    }
    
    
}

    public static void main(String[] args) {
        
       Objectmethod obj=new Objectmethod () ;
       int big =obj.max(7,73);
        System.out.println("The max is:"+big);
    }
}
