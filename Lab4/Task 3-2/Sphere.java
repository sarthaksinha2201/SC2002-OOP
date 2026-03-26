// Sphere "has a" Circle (composition).
// Surface area = 4 * PI * r^2
public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double computeSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}