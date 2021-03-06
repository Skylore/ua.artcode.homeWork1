package week3;

import java.util.Scanner;

public class $3_5 {
    public static void main(String[] args) {

        int height = Intro.height();
        int width = Intro.width();
        if (height <= 0 || width <= 0) {
            return;
        }

        System.out.println("How would you like to swap matrix? \n1 - Swap lines \n2 - Swap columns");

        int answer = new Scanner(System.in).nextInt();


        int matrix[][] = GenerateMatrix.matrix(height, width);

        System.out.println("Default matrix: ");

        PrintMatrix.printMat(matrix);


        if (answer == 1) {

            System.out.println("\n matrix with swapped lines: ");

            int swappedLinesMatrix[][] = $3_5_SwapLines.swapLines(matrix, height);

            PrintMatrix.printMat(swappedLinesMatrix);

        } else if (answer == 2) {

            System.out.println("\n matrix with swapped columns: ");

            int swappedColumns[][] = $3_5_SwapColumns.swapColumns(matrix, height);

            PrintMatrix.printMat(swappedColumns);
        }

    }
}

