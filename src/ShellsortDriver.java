import java.util.Arrays;
import java.util.Random;

public class ShellsortDriver {

    
    public static void main(String[] args)
        {

            //Integer[] data = new Integer[] {9, 6, 8, 12, 3, 1, 7};

            Random rand = new Random();
            //Integer[] data = new Integer[10];
            Integer[] data = new Integer[20];
            for (int i = 0; i < data.length; i++)
            {
                data[i] = rand.nextInt(100) + 1;
            }




            System.out.println("The array before shell sort: ");
            System.out.println(Arrays.toString(data));
            System.out.println();
            
            Sorting.shellSort(data);
            
            System.out.println("The array after shell sort: ");
            System.out.println(Arrays.toString(data));
            System.out.println();
        }

}
