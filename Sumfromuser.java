

package com.mycompany.sumfromuser;

import java.util.Scanner;
public class Sumfromuser {

    public static void main(String[] args) {
        Scanner amit =new Scanner(System.in);
        System.out.print("Enter first number: ");
       int x = amit.nextInt();

        System.out.print("Enter second number: ");
         int y = amit.nextInt();
        int sum=x+y;
        System.out.println("The sum is:"+sum);
    }
}
