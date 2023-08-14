import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 3, 4, 2, 2, 7, 2, 128, 256};

        int newSize = array.length;
        System.out.print("Enter a number for delete: ");
        int numberDel = scanner.nextInt();

        int BinaryArr = Arrays.binarySearch(array, numberDel);


        for (int i = 0; i < newSize; i++) {
            if (array[i] == numberDel) {

                for (int j = i; j < newSize - 1; j++) {
                    array[j] = array[j + 1];
                }
                newSize--;
                i--;

            }
        }

        int[] NewArray = new int[newSize];
        System.arraycopy(array, 0, NewArray, 0, newSize);

        if (BinaryArr < 0){
            System.out.println("There is no such number in the array");
        }else {
            System.out.println("New sorted array: "+ Arrays.toString(NewArray));
        }

    }
}