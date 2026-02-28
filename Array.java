
package com.mycompany.array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {

        Scanner amit = new Scanner(System.in);

        int n = amit.nextInt();
        int array[] = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = amit.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }
}