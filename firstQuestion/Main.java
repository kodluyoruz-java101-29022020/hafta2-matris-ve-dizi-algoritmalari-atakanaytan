package firstQuestion;

public class Main {

    public static void main(String[] args) {

         MatriceOperations matriceOperations = new MatriceOperations();
         GameOfLife gameOfLife = new GameOfLife();
         int[][] result = matriceOperations.fillMatrice();

        gameOfLife.gameOfLife(result);
        System.out.println("----------------");
        matriceOperations.printMatrice(result);


    }
}
