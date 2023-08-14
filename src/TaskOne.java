import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        int[] MyArray = {1, 2, 4, 8, 16, 32, 64, 128, 256};

        System.out.print("Enter the number: ");
        int scan = new Scanner(System.in).nextInt();
        int BinaryArrays = Arrays.binarySearch(MyArray, scan);

        System.out.println(
                BinaryArrays >= 0 ? "The number is included in the array" : "The number is NOT included in the array"
        );

    }
}

//for (int i = 0; i < MyArray.length; i++){
//        if (MyArray[i] == scan){
//        System.out.println("The number is included in the array");
//        }else {
//        System.out.println("The number is NOT included in the array");