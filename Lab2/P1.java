package Lab2;
import java.util.Scanner;

public class P1 {
        public static void main(String[] args) {
            int choice;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Perform the following methods:");
                System.out.println("1:  multiplication test");
                System.out.println("2:  quotient using division by subtraction");
                System.out.println("3:  remainder using division by subtraction");
                System.out.println("4:  count the number of digits");
                System.out.println("5:  position of a digit");
                System.out.println("6:  extract all odd digits");
                System.out.println("7:  quit");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        mulTest();
                        break;
                    case 2:
                        System.out.print("Enter m: ");
                        int m2 = sc.nextInt();
                        System.out.print("Enter n: ");
                        int n2 = sc.nextInt();
                        System.out.println("Quotient = " + divide(m2, n2));
                        break;
                    case 3:
                        System.out.print("Enter m: ");
                        int m3 = sc.nextInt();
                        System.out.print("Enter n: ");
                        int n3 = sc.nextInt();
                        System.out.println("Remainder = " + modulus(m3, n3));
                        break;
                    case 4:
                        System.out.print("Enter n: ");
                        int n4 = sc.nextInt();
                        if (n4 < 0) {
                            System.out.println("Error input!!");
                        } else {
                            System.out.println("count = " + countDigits(n4));
                        }
                        break;
                    case 5:
                        System.out.print("Enter n: ");
                        int n5 = sc.nextInt();
                        System.out.print("Enter digit: ");
                        int d5 = sc.nextInt();
                        System.out.println("position = " + position(n5, d5));
                        break;
                    case 6:
                        System.out.print("Enter n: ");
                        long n6 = sc.nextLong();
                        if (n6 < 0) {
                            System.out.println("Error input!!");
                        } else {
                            long result = extractOddDigits(n6);
                            System.out.println("oddDigits = " + result);
                        }
                        break;
                    case 7:
                        System.out.println("Program terminating ....");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice < 7);
        }

        // 3.2 Multiplication test
        public static void mulTest() {
            Scanner sc = new Scanner(System.in);
            int correct = 0;
            for (int i = 0; i < 5; i++) {
                int a = (int)(Math.random() * 9) + 1;
                int b = (int)(Math.random() * 9) + 1;
                System.out.print("How much is " + a + " times " + b + "? ");
                int answer = sc.nextInt();
                if (answer == a * b) {
                    correct++;
                }
            }
            System.out.println(correct + " answers out of 5 are correct.");
        }

        // 3.3 Division by subtraction - returns quotient
        public static int divide(int m, int n) {
            int count = 0;
            while (m >= n) {
                m = m - n;
                count++;
            }
            return count;
        }

        // 3.4 Division by subtraction - returns remainder
        public static int modulus(int m, int n) {
            while (m >= n) {
                m = m - n;
            }
            return m;
        }

        // 3.5 Count number of digits
        public static int countDigits(int n) {
            if (n == 0) return 1;
            int count = 0;
            while (n > 0) {
                n = n / 10;
                count++;
            }
            return count;
        }

        // 3.6 Position of first appearance of digit (from right, starting at 1)
        public static int position(int n, int digit) {
            int pos = 1;
            while (n > 0) {
                if (n % 10 == digit) {
                    return pos;
                }
                n = n / 10;
                pos++;
            }
            return -1;
        }

        // 3.7 Extract odd digits and combine into new number
        public static long extractOddDigits(long n) {
            if (n < 0) return -1;
            String result = "";
            String s = Long.toString(n);
            for (int i = 0; i < s.length(); i++) {
                int digit = Character.getNumericValue(s.charAt(i));
                if (digit % 2 != 0) {
                    result += digit;
                }
            }
            if (result.isEmpty()) return -1;
            return Long.parseLong(result);
        }
    }
