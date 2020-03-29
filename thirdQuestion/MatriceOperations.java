package thirdQuestion;

import java.util.Scanner;

public class MatriceOperations {

    private int randomScaleValue = 10;

    static Scanner scanner = new Scanner(System.in);

    public void setRandomScaleValue(int randomScaleValue) {

        this.randomScaleValue = randomScaleValue;
    }


    public int[][] fillMatrice(int rowCount, int columnCount) {

        int[][] matrice = new int[rowCount][columnCount];

        for (int i = 0; i < matrice.length; i++) {

            for (int j = 0; j < matrice[0].length; j++) {

                int matriceValue = (int)(Math.random() * this.randomScaleValue);
                matrice[i][j] = matriceValue;
            }
        }

        return matrice;
    }


    public int[][] createMatrice(){
        System.out.println("Enter The Number Of Matrice Rows");

        int row = scanner.nextInt();

        System.out.println("Enter The Number Of Matrice Columns");

        int col = scanner.nextInt();

        System.out.println("Enter The Datas Of The Matrice \n");

        //Enter Matrice Data
        int[][] result = fillMatrice(row, col);

        //Print Matrice Data
        printMatrice(result);

        return result;

    }

    public static void printMatrice(int[][] matrice) {

        for (int i = 0; i<matrice.length; i++) {

            for (int j = 0; j < matrice[0].length; j++){

                System.out.print(matrice[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public int[][] multiplyMatrixes(int[][] firstMatrix, int[][] secondMatrix) {

        int[][] resultMatrix = new int[firstMatrix.length][secondMatrix[0].length];

        for (int i = 0; i <resultMatrix.length; i++ ) {

            for (int j = 0; j < resultMatrix[0].length; j++) {

                int result = 0;
                for (int k = 0; k < secondMatrix.length; k++) {
                    result += firstMatrix[i][k] * secondMatrix[k][j];
                }
                resultMatrix[i][j] = result;
            }
        }

        return resultMatrix;
    }

}
