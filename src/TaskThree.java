import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to fill in the array: ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Your array: " + Arrays.toString(array));

        Arrays.sort(array);

        int min = array[0];
        int max = array[array.length - 1];
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        int average = sum / array.length;

        System.out.printf("max value: %d \nmin value: %d \naverage value: %d", max, min, average );

    }

}
