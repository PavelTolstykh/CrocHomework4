class AnnotatedImage {

    private final String imagePath;

    private final Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation[] annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public Annotation[] getAnnotations() {
        return this.annotations;
    }

    public Annotation findByPoint(int x, int y) {
        for (Annotation a : annotations) {
            Figure fig = a.getFigure();
            if (fig instanceof Circle && ((Circle) fig).getX0() - ((Circle) fig).getR() < x &&
                    x < ((Circle) fig).getX0() + ((Circle) fig).getR() && ((Circle) fig).getY0() -
                    ((Circle) fig).getR() < y && y < ((Circle) fig).getY0() + ((Circle) fig).getR()) {
                return a;
            } else if (fig instanceof Rectangle && ((Rectangle) fig).getX1() < x && x < ((Rectangle) fig).getX2() &&
                    ((Rectangle) fig).getY1() < y && y < ((Rectangle) fig).getY2()) {
                return a;
            }
        }
        return null;
    }

    public Annotation findByLabel(String label) {
        for (Annotation a : annotations) {
            Figure fig = a.getFigure();
            if ((fig instanceof Circle || fig instanceof  Rectangle) && (((Circle)fig).getName().contains(label)
                    || ((Rectangle)fig).getName().contains(label))) {
                return a;
            }
        }
        return null;
    }
}

