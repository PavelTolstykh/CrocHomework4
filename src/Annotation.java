public class Annotation {
    private Figure figure;

    public Annotation(Figure figure) {
        this.figure = figure;
    }

    public Figure getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        String s = "";
        if (figure instanceof Circle) {
            s = "C (" + ((Circle) figure).getX0() + ", " + ((Circle) figure).getY0() + "), " +
                    ((Circle) figure).getR() + ": " + ((Circle) figure).getName();
        } else if (figure instanceof Rectangle) {
            s = "R (" + ((Rectangle) figure).getX1() + ", " + ((Rectangle) figure).getY1() + "), " + "(" +
                    ((Rectangle) figure).getX2() + ", " + ((Rectangle) figure).getY2() + "): " +
                    ((Rectangle) figure).getName();
        }
        return s;
    }
}
