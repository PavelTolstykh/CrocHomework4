public class Circle extends Figure implements Movable{
    private double x0, y0, r;
    private String name;

    public Circle(int x0, int y0, int r, String name) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
        this.name = name;
    }

    public double getX0() {
        return x0;
    }

    public double getY0() {
        return y0;
    }

    public double getR() {
        return r;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move(int dx, int dy) {
        x0 += dx;
        y0 += dy;
    }
}
