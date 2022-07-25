public class ShellsortDriver {

    
    public static void main(String[] args)
        {
            Integer[] data = new Integer[] {12, 34, 54, 2, 3};
            //int[] data = {9, 6, 8, 12, 3, 1, 7};
            System.out.println("The array before shell sort: ");
            for (int i = 0; i < data.length; ++i) 
            {
                System.out.print(data[i]);
            }
            System.out.println():
            
            Sorting.shellSort(data);
            
            System.out.println("The array after shell sort: ");
            for (Integer datum: data)
                System.out.print(datum);
            System.out.println():   
        }

}
