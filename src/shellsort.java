//package com.company;

//import java.util.Arrays;
//import java.lang.Comparable;

//for example only!! algorithm works but doesn't meet assignment requirements

public class Shellsort
{
    /* utility function to print array of size n */
    static void printArr( int data [])
    {
        int n = data.length;
        for (int i = 0; i < n; ++i)
        {
            System.out.print(data[i] + " ");


        } System.out.println();
    }


    void shellSort (int[] data)
    {
        int dataLen = data.length;
        //start with a larger gap then divide in half for each subsequent pass
        for (int gap = dataLen / 2; gap > 0; gap /= 2)
        {
            //gapped insertion sort for this gap size
            for (int i = gap; i < dataLen; i+=1)
            {
                // add data[i] to the elements that have been gap sorted. save data[i] in temp and
                //make a hole at position i
                int temp = data[i];
                //shift earlier gap sorted elements up until correct location for data[i] is found
                for (int j = i; j >= gap && data[j - gap] > temp; j -= gap)
                {
                    data[j] = data[j - gap];
                    //put temp in its new correct position
                    data[j-gap] = temp;
                    System.out.println("A swap occurred: ");
                    printArr(data);
                }
            }

        }

    }

    public static void main(String[] args)
    {
         int[] data = {12, 34, 54, 2, 3};
        //int[] data = {9, 6, 8, 12, 3, 1, 7};
        System.out.println("The array before shell sort: ");
        printArr(data);

        Shellsort shell = new Shellsort();
        shell.shellSort(data);

        System.out.println("The array after shell sort: ");
        printArr(data);
    }
}
