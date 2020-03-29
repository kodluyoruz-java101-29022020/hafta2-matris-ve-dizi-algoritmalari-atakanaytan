package fourthQuestion;


import java.util.*;

public class Main {
    public static void main(String[] args) {

      int[] randomArray=  createRandomList();

      printArray(randomArray);

     Set<Integer> result = findRecurredNumbers(randomArray);
     System.out.println("\n -------------");
     System.out.println("Recurred numbers are;");
     printHashSet(result);
    }

    private static int[] createRandomList(){
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        System.out.println("Enter the legnth of the list");

        int sizeOfTheList = scanner.nextInt();

        int[] list = new int[sizeOfTheList];

        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(10);
        }

        return list;
    }

    private static Set<Integer> findRecurredNumbers(int[] array) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> unique = new HashSet<>();

        for  (int i = 0; i < array.length; i++ ){

            if (set.contains(array[i])) {

                unique.add(array[i]);
            } else {
                set.add(array[i]);
            }
    }
        return unique;
    }


    private static void printArray(int[] array) {

        for (int i : array){

            System.out.print(i +" ");
        }
    }

    private static void printHashSet(Set<Integer> set){

        for (int i : set) {
            System.out.print(i+ " ");
        }
    }
}
