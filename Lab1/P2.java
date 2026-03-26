package Lab1;

import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter merit points: ");
        int merit = sc.nextInt();

        char grade;

        if (salary >= 700) {
            if (merit >= 20)
                grade = 'A';
            else
                grade = 'B';
        }
        else if (salary >= 600) {
            if (merit >= 10)
                grade = 'B';
            else
                grade = 'C';
        }
        else {
            grade = 'C';
        }

        System.out.println("Grade " + grade);

    }
}
