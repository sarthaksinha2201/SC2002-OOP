import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of shapes: ");
        int n = sc.nextInt();

        Shape[] shapes = new Shape[n];

        // Enter each shape
        for (int i = 0; i < n; i++) {
            System.out.println("\nChoose shape " + (i + 1) + ":");
            System.out.println("1: Circle");
            System.out.println("2: Triangle");
            System.out.println("3: Rectangle");
            System.out.println("4: Square");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    shapes[i] = new Circle(r);
                    break;
                case 2:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    shapes[i] = new Triangle(base, height);
                    break;
                case 3:
                    System.out.print("Enter length: ");
                    double len = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = sc.nextDouble();
                    shapes[i] = new Rectangle(len, breadth);
                    break;
                case 4:
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    shapes[i] = new Square(side);
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Circle with radius 1.");
                    shapes[i] = new Circle(1);
            }
        }

        // Calculate upon user's request
        System.out.println("\nChoose calculation:");
        System.out.println("1: Compute total area");
        System.out.print("Your choice: ");
        int calcChoice = sc.nextInt();

        if (calcChoice == 1) {
            double totalArea = 0;
            for (Shape s : shapes)
                totalArea += s.computeArea();  // polymorphism: correct computeArea() called per shape
            System.out.printf("Total area of all shapes = %.2f%n", totalArea);
        } else {
            System.out.println("Invalid calculation choice.");
        }
    }
}