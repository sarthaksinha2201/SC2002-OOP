import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of shapes: ");
        int n = sc.nextInt();

        Shape3D[] shapes = new Shape3D[n];

        // Enter each shape
        for (int i = 0; i < n; i++) {
            System.out.println("\nChoose shape " + (i + 1) + ":");
            System.out.println("1: Sphere");
            System.out.println("2: Cuboid");
            System.out.println("3: Pyramid (square-based)");
            System.out.println("4: Cone");
            System.out.println("5: Cylinder");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    shapes[i] = new Sphere(r);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double len = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h2 = sc.nextDouble();
                    shapes[i] = new Cuboid(len, breadth, h2);
                    break;
                case 3:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h3 = sc.nextDouble();
                    shapes[i] = new Pyramid(base, h3);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    double cr = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double ch = sc.nextDouble();
                    shapes[i] = new Cone(cr, ch);
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    double ylr = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double ylh = sc.nextDouble();
                    shapes[i] = new Cylinder(ylr, ylh);
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Sphere with radius 1.");
                    shapes[i] = new Sphere(1);
            }
        }

        // Calculate upon user's request
        System.out.println("\nChoose calculation:");
        System.out.println("1: Compute total surface area");
        System.out.print("Your choice: ");
        int calcChoice = sc.nextInt();

        if (calcChoice == 1) {
            double totalArea = 0;
            for (Shape3D s : shapes)
                totalArea += s.computeSurfaceArea();  // polymorphism: correct method called per shape
            System.out.printf("Total surface area of all shapes = %.2f%n", totalArea);
        } else {
            System.out.println("Invalid calculation choice.");
        }
    }
}