package array2d;

import java.util.*;

public class Array2d {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int rows = obj.nextInt();
        int colum = obj.nextInt();

        int[][] number = new int[rows][colum];

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                number[i][j] = obj.nextInt();
            }
        }

        // Search value
        int x = obj.nextInt();

        // Searching
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {

                if (number[i][j] == x) {
                    System.out.println("Found (" + i + "," + j + ")");
                }
            }
        }
    }
}