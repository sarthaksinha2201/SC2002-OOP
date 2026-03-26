// Cylinder "has a" Circle base (composition).
// Surface area = 2 * PI * r^2 + 2 * PI * r * h
public class Cylinder extends Shape3D {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double computeSurfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}