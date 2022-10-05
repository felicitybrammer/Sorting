import java.util.Arrays;

/**
 * Sorting demonstrates sorting and searching on an array 
 * of objects.
 *
 */
public class Q3ModifiedSorting
{
    /**
    * Sorts the specified array of integers using the shell 
    * sort algorithm
    *
    * @param data the array to be sorted
    */


    public static <T extends Comparable<T>> 
	void shellSort(T[] data)
    {


        int swapCount = 0;
		int compareCount = 0;


        for (int gap = data.length / 2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < data.length; i += 1) 
            {
				compareCount++;
                T temp = data[i];
                for (int j = i; j >= gap && data[j - gap].compareTo(temp) > 0; j -= gap)
                {
                    data[j] = data[j - gap];
                    data[j - gap] = temp;   
                    swapCount++;
                    // System.out.println("A swap occurred: ");
					// System.out.println(Arrays.toString(data));
                }
            }
        }

        System.out.println("Total swap count: " + swapCount);
        System.out.println("Total compare count: " + compareCount);
    }

	/**
	 * Swaps to elements in an array. Used by various sorting algorithms.
	 * 
	 * @param data   the array in which the elements are swapped
	 * @param index1 the index of the first element to be swapped
	 * @param index2 the index of the second element to be swapped
	 */
	private static <T extends Comparable<T>> 
	void swap(T[] data, int index1, int index2)
	{
		T temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}

	/**
	 * Sorts the specified array of objects using a bubble sort
	 * algorithm.
	 *
	 * @param data the array to be sorted
	 */
	public static <T extends Comparable<T>> 
	void bubbleSort(T[] data)
	{
		int position, scan;
		int swapCount = 0;
		int compareCount = 0;
		//position represents the max index to examine in the inner loop
		for (position =  data.length - 1; position >= 0; position--)
		{

			for (scan = 0; scan <= position - 1; scan++)
			{
				compareCount++;
				if (data[scan].compareTo(data[scan + 1]) > 0) {
					swap(data, scan, scan + 1);
					swapCount++;
				}
			}

		}
		System.out.println("Total swap count: " + swapCount);
		System.out.println("Total compare count: " + compareCount);
	}

    /**
	 * Sorts the specified array of objects using an optimized bubble sort
	 * algorithm.
	 *
	 * @param data the array to be sorted
	 */
     public static <T extends Comparable<T>> 
     void bubbleSort2(T[] data)
     {

        boolean swapflag = true;
		int swapCount = 0;
		int compareCount = 0;
		int scan;
		int position = data.length - 1;

		while (swapflag) {


			swapflag = false; //set flag to false awaiting a possible swap
			
			for (scan = 0; scan < position; scan++)
			{
				compareCount++;
				if (data[scan].compareTo(data[scan + 1]) > 0) {
					swap(data, scan, scan + 1);
					swapCount++;
					swapflag = true;
					// System.out.println("A swap occurred: ");
					// System.out.println("Number of swaps: " + swapCount);
 					// System.out.println(Arrays.toString(data));
			}
				position--;
		}

		// System.out.println("No more swaps");
		// System.out.println(Arrays.toString(data));
		//System.out.println("Number of swaps: " + swapCount);
		}
		 System.out.println("Total swap count: " + swapCount);
		 System.out.println("Total compare count: " + compareCount);
     }

                    


}

