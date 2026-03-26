// Cone "has a" Circle base (composition).
// Surface area = PI * r^2 + PI * r * slantHeight
public class Cone extends Shape3D {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double computeSurfaceArea() {
        double slantHeight = Math.sqrt(height * height + radius * radius);
        return Math.PI * radius * radius + Math.PI * radius * slantHeight;
    }
}