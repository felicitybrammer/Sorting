import java.util.Arrays;
import java.util.Random;


public class BubblesortDriver {

    //The driver should test both methods with a random set of 10 integers
    //and an already sorted set of 10 integers.
    public static void main(String[] args)
    {

        Integer[] sorted = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Random rand = new Random();
        Integer[] data = new Integer[10];

        for (int i = 0; i < data.length; i++)
        {
            data[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Random array before bubble sort: ");
        System.out.println(Arrays.toString(data));
        System.out.println();

        Sorting.bubbleSort(data);


        System.out.println("Random array after bubble sort: ");
        System.out.println(Arrays.toString(data));
        System.out.println();

        System.out.println("Sorted array before bubble sort: ");
        System.out.println(Arrays.toString(sorted));
        System.out.println();

        Sorting.bubbleSort(sorted);

        System.out.println("Sorted array after bubble sort: ");
        System.out.println(Arrays.toString(sorted));
        System.out.println();
    }

}
