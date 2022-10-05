// tally total number of comparisons (compareTo calls)
// tally number of swaps
// find total execution time of each alg
import java.util.Arrays;
import java.util.Random;

public class Q3Driver {

    
    public static void main(String[] args)
        {
           // The driver should construct lists of size 10, 100, and 1000—both in random 
           //and already in sorted order. Use the Integer wrapper class for the array type.
            
            //initialize 3 sorted arrays - these will be the same for each sort method.
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
            //generate random integers for each array
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

            //make copies of random arrays for use in bubbleSort
            Integer[] copy1 = Arrays.copyOf(data1, 10);
            Integer[] copy2 = Arrays.copyOf(data2, 100);
            Integer[] copy3 = Arrays.copyOf(data3, 1000);

            //make copies of random arrays for use in bubbleSort2
            Integer[] copy4 = Arrays.copyOf(data1, 10);
            Integer[] copy5 = Arrays.copyOf(data2, 100);
            Integer[] copy6 = Arrays.copyOf(data3, 1000);

            //ShellSort

              System.out.println("--------ShellSort--------");
              long start1 = System.nanoTime();
//            System.out.println("Sorted array 1 before shell sort: ");
//            System.out.println(Arrays.toString(sorted1));
              Q3ModifiedSorting.shellSort(sorted1);
//            System.out.println("Sorted array 1 after shell sort: ");
//            System.out.println(Arrays.toString(sorted1));
//            System.out.println();

//            System.out.println("Sorted array 2 before shell sort: ");
//            System.out.println(Arrays.toString(sorted2));
              Q3ModifiedSorting.shellSort(sorted2);
//            System.out.println("Sorted array 2 after shell sort: ");
//            System.out.println(Arrays.toString(sorted2));
//            System.out.println();
//
//            System.out.println("Sorted array 3 before shell sort: ");
//            System.out.println(Arrays.toString(sorted3));
              Q3ModifiedSorting.shellSort(sorted3);
//            System.out.println("Sorted array 3 after shell sort: ");
//            System.out.println(Arrays.toString(sorted3));
//            System.out.println();
//
//
//            System.out.println("Random array 1 before shell sort: ");
//            System.out.println(Arrays.toString(data1));
              Q3ModifiedSorting.shellSort(data1);
//            System.out.println("Random array 1 after shell sort: ");
//            System.out.println(Arrays.toString(data1));
//            System.out.println();
//
//            System.out.println("Random array 2 before shell sort: ");
//            System.out.println(Arrays.toString(data2));
              Q3ModifiedSorting.shellSort(data2);
//            System.out.println("Random array 2 after shell sort: ");
//            System.out.println(Arrays.toString(data2));
//            System.out.println();
//
//            System.out.println("Random array 3 before shell sort: ");
//            System.out.println(Arrays.toString(data3));
              Q3ModifiedSorting.shellSort(data3);
//            System.out.println("Random array 3 after shell sort: ");
//            System.out.println(Arrays.toString(data3));
//            System.out.println();
            long end1 = System.nanoTime();
            System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
//
//            //BubbleSort
              System.out.println("--------BubbleSort--------");
              long start2 = System.nanoTime();
//            System.out.println("Sorted array 1 before bubble sort: ");
//            System.out.println(Arrays.toString(sorted1));
              Q3ModifiedSorting.bubbleSort(sorted1);
//            System.out.println("Sorted array 1 after bubble sort: ");
//            System.out.println(Arrays.toString(sorted1));
//            System.out.println();
//
//            System.out.println("Sorted array 2 before bubble sort: ");
//            System.out.println(Arrays.toString(sorted2));
              Q3ModifiedSorting.bubbleSort(sorted2);
//            System.out.println("Sorted array 2 after bubble sort: ");
//            System.out.println(Arrays.toString(sorted2));
//            System.out.println();
//
//            System.out.println("Sorted array 3 before bubble sort: ");
//            System.out.println(Arrays.toString(sorted3));
              Q3ModifiedSorting.bubbleSort(sorted3);
//            System.out.println("Sorted array 3 after bubble sort: ");
//            System.out.println(Arrays.toString(sorted3));
//            System.out.println();
//
//
//            System.out.println("Random array 1 before bubble sort: ");
//            System.out.println(Arrays.toString(copy1));
            Q3ModifiedSorting.bubbleSort(copy1);
//            System.out.println("Random array 1 after bubble sort: ");
//            System.out.println(Arrays.toString(copy1));
//            System.out.println();
//
//            System.out.println("Random array 2 before bubble sort: ");
//            System.out.println(Arrays.toString(copy2));
            Q3ModifiedSorting.bubbleSort(copy2);
//            System.out.println("Random array 2 after bubble sort: ");
//            System.out.println(Arrays.toString(copy2));
//            System.out.println();
//
//            System.out.println("Random array 3 before bubble sort: ");
//            System.out.println(Arrays.toString(copy3));
           Q3ModifiedSorting.bubbleSort(copy3);
//            System.out.println("Random array 3 after bubble sort: ");
//            System.out.println(Arrays.toString(copy3));
//            System.out.println();
            long end2 = System.nanoTime();
            System.out.println("Elapsed Time in nano seconds: "+ (end2-start2));
//
//            //BubbleSort2
              System.out.println("--------BubbleSort2--------");
              long start3 = System.nanoTime();
//            System.out.println("Sorted array 1 before bubble2 sort: ");
//            System.out.println(Arrays.toString(sorted1));
              Q3ModifiedSorting.bubbleSort2(sorted1);
//            System.out.println("Sorted array 1 after bubble2 sort: ");
//            System.out.println(Arrays.toString(sorted1));
//            System.out.println();
//
//            System.out.println("Sorted array 2 before bubble2 sort: ");
//            System.out.println(Arrays.toString(sorted2));
            Q3ModifiedSorting.bubbleSort2(sorted2);
//            System.out.println("Sorted array 2 after bubble2 sort: ");
//            System.out.println(Arrays.toString(sorted2));
//            System.out.println();
//
//            System.out.println("Sorted array 3 before bubble2 sort: ");
//            System.out.println(Arrays.toString(sorted3));
            Q3ModifiedSorting.bubbleSort2(sorted3);
//            System.out.println("Sorted array 3 after bubble2 sort: ");
//            System.out.println(Arrays.toString(sorted3));
//            System.out.println();
//
//
//            System.out.println("Random array 1 before bubble2 sort: ");
//            System.out.println(Arrays.toString(copy4));
            Q3ModifiedSorting.bubbleSort2(copy4);
//            System.out.println("Random array 1 after bubble2 sort: ");
//            System.out.println(Arrays.toString(copy4));
//            System.out.println();
//
//            System.out.println("Random array 2 before bubble2 sort: ");
 //           System.out.println(Arrays.toString(copy5));
            Q3ModifiedSorting.bubbleSort2(copy5);
//            System.out.println("Random array 1 after bubble2 sort: ");
//            System.out.println(Arrays.toString(copy5));
//            System.out.println();
//
//            System.out.println("Random array 3 before bubble2 sort: ");
//            System.out.println(Arrays.toString(copy6));
            Q3ModifiedSorting.bubbleSort2(copy6);
//            System.out.println("Random array 1 after bubble2 sort: ");
//            System.out.println(Arrays.toString(copy6));
//            System.out.println();
            long end3 = System.nanoTime();
            System.out.println("Elapsed Time in nano seconds: "+ (end3-start3));

            
        }

}
