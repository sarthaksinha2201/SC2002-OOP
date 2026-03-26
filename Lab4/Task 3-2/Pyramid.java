// Square-based Pyramid "has a" Square base (composition).
// Surface area = base^2 + 2 * base * slantHeight
public class Pyramid extends Shape3D {
    private double base;
    private double height;

    public Pyramid(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeSurfaceArea() {
        // slant height = sqrt(h^2 + (base/2)^2)
        double slantHeight = Math.sqrt(height * height + (base / 2) * (base / 2));
        return base * base + 2 * base * slantHeight;
    }
}