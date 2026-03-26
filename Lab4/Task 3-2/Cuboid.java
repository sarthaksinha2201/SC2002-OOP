// Cuboid "has a" Rectangle base (composition).
// Surface area = 2(lb + bh + lh)
public class Cuboid extends Shape3D {
    private double length;
    private double breadth;
    private double height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double computeSurfaceArea() {
        return 2 * (length * breadth + breadth * height + length * height);
    }
}