package firstQuestion;

import java.util.Scanner;

public class MatriceOperations {

    static Scanner scanner = new Scanner(System.in);

    public int[][] fillMatrice() {

        System.out.println("Please enter the length of rows");
        int rowLength = scanner.nextInt();

        System.out.println("-------------------------------");

        System.out.println("Please enter the length of columns");
        int columnLength = scanner.nextInt();

        int[][] matrix = new int[rowLength][columnLength];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static void printMatrice(int[][] matrice) {

        for (int i = 0; i<matrice.length; i++) {

            for (int j = 0; j < matrice[0].length; j++){

                System.out.print(matrice[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
