public class ShellsortDriver {

    public static void main(String[] args)
        {
            Integer[] data = {12, 34, 54, 2, 3};
            //int[] data = {9, 6, 8, 12, 3, 1, 7};
            System.out.println("The array before shell sort: ");
            printArr(data);

            Shellsort shell = new Shellsort();
            shell.shellSort(data);

            System.out.println("The array after shell sort: ");
            printArr(data);
        }

}
