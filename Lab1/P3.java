package Lab1;

import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Starting value: ");
        int start = sc.nextInt();

        System.out.print("Ending value: ");
        int end = sc.nextInt();

        System.out.print("Increment: ");
        int inc = sc.nextInt();

        if (start > end || inc <= 0) {
            System.out.println("Error input!!");
            return;
        }

        double rate = 1.82;

        System.out.println("\nFOR LOOP");
        System.out.println("US$   S$");
        System.out.println("-----------");

        for (int i = start; i <= end; i += inc) {
            System.out.printf("%-10d %.2f\n", i, i*rate);//(i + "   " + (i * rate));
        }

        System.out.println("\nWHILE LOOP");
        int i = start;
        while (i <= end) {
            System.out.printf("%-10d %.2f\n", i, i*rate); // i + "   " + (i * rate));
            i += inc;
        }

        System.out.println("\nDO WHILE LOOP");
        i = start;
        do {
            System.out.printf("%-10d %.2f\n", i , i*rate); //(i + "   " + (i * rate));
            i += inc;
        } while (i <= end);

    }

}
