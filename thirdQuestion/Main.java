package thirdQuestion;

public class Main {

    public static void main(String[] args) {
        MatriceOperations matriceOperations = new MatriceOperations();

        //Enter the first matrix's rows, and columns information
      int[][] firstMatrice =  matriceOperations.createMatrice();

        System.out.println("******************");

        //Enter the second matrix's rows, and columns information
        int[][] secondMatrice =  matriceOperations.createMatrice();

        System.out.println("******************");

        int[][] result = matriceOperations.multiplyMatrixes(firstMatrice, secondMatrice);


        matriceOperations.printMatrice(result);
    }
}
