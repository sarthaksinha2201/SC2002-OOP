import java.util.Scanner;

public class Numbers {
    // --------------------------------------------
    // Reads in an array of integers, sorts them
    // in descending order, then prints them.
    // --------------------------------------------
    public static void main(String[] args) {
        Integer[] intList;  // Changed from int[] to Integer[] to work with Comparable
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();  // autoboxing: int -> Integer automatically

        Sorting.insertionSort(intList);   // now calls descending insertionSort

        System.out.println("\nYour numbers in sorted order (descending)...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();
    }
}