package secondQuestion;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    int[][] matrix = {
            {1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24 ,25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
    };

    List<Integer> result = spiralOrderMatrix(matrix);


    printArrayList(result);

    }

    public static List<Integer> spiralOrderMatrix(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0) {
            return result;
        }

        int rowFirst = 0;
        int rowEnd = matrix.length - 1;

        int colFirst = 0;
        int colEnd = matrix[0].length - 1;

        while (rowFirst <= rowEnd && colFirst <= colEnd) {

            for (int i = colFirst; i <= colEnd; i++) {
                result.add(matrix[rowFirst][i]);
            }

            rowFirst++;

            for (int i = rowFirst; i <= rowEnd; i++){
                result.add(matrix[i][colEnd]);
            }

            colEnd--;

            if (rowFirst <= rowEnd) {

                for (int i = colEnd; i >= colFirst; i-- ) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (colFirst <= colEnd) {

                for (int i = rowEnd; i >= rowFirst; i--){
                    result.add(matrix[i][colFirst]);
                }
            }
            colFirst++;
        }
        return result;
    }

    private static void printArrayList(List<Integer> list){

        for (Integer number : list) {

            System.out.print(number+ " ");
        }
     }

}
