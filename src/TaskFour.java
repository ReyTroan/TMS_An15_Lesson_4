import java.util.Arrays;

public class TaskFour {
    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];

        for (int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = (int) (Math.random() * 20);
            arrayTwo[i] = (int) (Math.random() * 20);
        }

        System.out.println("Array One: " + Arrays.toString(arrayOne));
        System.out.println("Array Two: " + Arrays.toString(arrayTwo));

         int sumOne = 0; int sumTwo = 0;

        for (int i = 0; i < arrayOne.length; i++){
            sumOne += arrayOne[i];
            sumTwo += arrayTwo[i];
        }
        int averageArrayOne = sumOne / arrayOne.length;
        int averageArrayTwo = sumTwo / arrayTwo.length;

        if (averageArrayOne > averageArrayTwo){
            System.out.println("Average value 'Array One' > Average value 'Array Two'");
        }else if (averageArrayTwo > averageArrayOne){
            System.out.println("Average value 'Array Two' > Average value 'Array One'");
        }else {
            System.out.println("Average value 'Array One' == Average value 'Array Two'");
        }

    }
}
