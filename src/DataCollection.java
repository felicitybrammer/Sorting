// tally total number of comparisons (compareTo calls)
// tally number of swaps
// find total execution time of each alg
import java.util.Arrays;
import java.util.Random;

public class DataCollection {

    
    public static void main(String[] args)
        {
           // The driver should construct lists of size 10, 100, and 1000—both in random 
           //and already in sorted order. Use the Integer wrapper class for the array type.
            
            //initialize 3 sorted arrays
            Integer[] sorted1 = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Integer[] sorted2 = new Integer[100];
            Integer[] sorted3 = new Integer[1000];
            for (int i = 0; i < sorted2.length; i++) {
                sorted2[i] = i;
            }
            for (int i = 0; i < sorted3.length; i++) {
                sorted3[i] = i;
            }

            //initialize 3 random arrays
            Random rand = new Random();
            Integer[] data1 = new Integer[10];
            Integer[] data2 = new Integer[100];
            Integer[] data3 = new Integer[1000];
            
            for (int i = 0; i < data1.length; i++)
            {
                data1[i] = rand.nextInt(100) + 1;
            }
             for (int i = 0; i < data2.length; i++)
            {
                data2[i] = rand.nextInt(100) + 1;
            }
             for (int i = 0; i < data3.length; i++)
            {
                data3[i] = rand.nextInt(100) + 1;
            }

            //ShellSort
            System.out.println("Sorted array 1 before shell sort: ");
            System.out.println(Arrays.toString(sorted1));
            Sorting.shellSort(sorted1);
            System.out.println("Sorted array 1 after shell sort: ");
            System.out.println(Arrays.toString(sorted1));
            System.out.println();

            System.out.println("Sorted array 2 before shell sort: ");
            System.out.println(Arrays.toString(sorted2));
            Sorting.shellSort(sorted2);
            System.out.println("Sorted array 2 after shell sort: ");
            System.out.println(Arrays.toString(sorted2));
            System.out.println();

            System.out.println("Sorted array 3 before shell sort: ");
            System.out.println(Arrays.toString(sorted3));
            Sorting.shellSort(sorted3);
            System.out.println("Sorted array 3 after shell sort: ");
            System.out.println(Arrays.toString(sorted3));
            System.out.println();


            System.out.println("Random array 1 before shell sort: ");
            System.out.println(Arrays.toString(data1));
            Sorting.shellSort(data1);
            System.out.println("Random array 1 after shell sort: ");
            System.out.println(Arrays.toString(data1));
            System.out.println();

            System.out.println("Random array 2 before shell sort: ");
            System.out.println(Arrays.toString(data2));
            Sorting.shellSort(data2);
            System.out.println("Random array 2 after shell sort: ");
            System.out.println(Arrays.toString(data2));
            System.out.println();

            System.out.println("Random array 3 before shell sort: ");
            System.out.println(Arrays.toString(data3));
            Sorting.shellSort(data3);
            System.out.println("Random array 3 after shell sort: ");
            System.out.println(Arrays.toString(data3));
            System.out.println();


            //BubbleSort
            System.out.println("Sorted array 1 before bubble sort: ");
            System.out.println(Arrays.toString(sorted1));
            Sorting.bubbleSort(sorted1);
            System.out.println("Sorted array 1 after bubble sort: ");
            System.out.println(Arrays.toString(sorted1));
            System.out.println();

            System.out.println("Sorted array 2 before bubble sort: ");
            System.out.println(Arrays.toString(sorted2));
            Sorting.bubbleSort(sorted2);
            System.out.println("Sorted array 2 after bubble sort: ");
            System.out.println(Arrays.toString(sorted2));
            System.out.println();

            System.out.println("Sorted array 3 before bubble sort: ");
            System.out.println(Arrays.toString(sorted3));
            Sorting.bubbleSort(sorted3);
            System.out.println("Sorted array 3 after bubble sort: ");
            System.out.println(Arrays.toString(sorted3));
            System.out.println();


            System.out.println("Random array 1 before bubble sort: ");
            System.out.println(Arrays.toString(data1));
            Sorting.bubbleSort(data1);
            System.out.println("Random array 1 after bubble sort: ");
            System.out.println(Arrays.toString(data1));
            System.out.println();

            System.out.println("Random array 2 before bubble sort: ");
            System.out.println(Arrays.toString(data2));
            Sorting.bubbleSort(data2);
            System.out.println("Random array 2 after bubble sort: ");
            System.out.println(Arrays.toString(data2));
            System.out.println();

            System.out.println("Random array 3 before bubble sort: ");
            System.out.println(Arrays.toString(data3));
            Sorting.bubbleSort(data3);
            System.out.println("Random array 3 after bubble sort: ");
            System.out.println(Arrays.toString(data3));
            System.out.println();

            //BubbleSort2
            System.out.println("Sorted array 1 before bubble2 sort: ");
            System.out.println(Arrays.toString(sorted1));
            Sorting.bubbleSort2(sorted1);
            System.out.println("Sorted array 1 after bubble2 sort: ");
            System.out.println(Arrays.toString(sorted1));
            System.out.println();

            System.out.println("Sorted array 2 before bubble2 sort: ");
            System.out.println(Arrays.toString(sorted2));
            Sorting.bubbleSort2(sorted2);
            System.out.println("Sorted array 2 after bubble2 sort: ");
            System.out.println(Arrays.toString(sorted2));
            System.out.println();

            System.out.println("Sorted array 3 before bubble2 sort: ");
            System.out.println(Arrays.toString(sorted3));
            Sorting.bubbleSort2(sorted3);
            System.out.println("Sorted array 3 after bubble2 sort: ");
            System.out.println(Arrays.toString(sorted3));
            System.out.println();


            System.out.println("Random array 1 before bubble2 sort: ");
            System.out.println(Arrays.toString(data1));
            Sorting.bubbleSort2(data1);
            System.out.println("Random array 1 after bubble2 sort: ");
            System.out.println(Arrays.toString(data1));
            System.out.println();

            System.out.println("Random array 1 before bubble2 sort: ");
            System.out.println(Arrays.toString(data2));
            Sorting.bubbleSort2(data2);
            System.out.println("Random array 1 after bubble2 sort: ");
            System.out.println(Arrays.toString(data2));
            System.out.println();

            System.out.println("Random array 1 before bubble2 sort: ");
            System.out.println(Arrays.toString(data3));
            Sorting.bubbleSort2(data3);
            System.out.println("Random array 1 after bubble2 sort: ");
            System.out.println(Arrays.toString(data3));
            System.out.println();

            
        }

}
