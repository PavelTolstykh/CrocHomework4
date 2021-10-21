import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(100, 100, 10, "Tree");
        Figure rect = new Rectangle(100, 100, 150, 200, "Car");
        Annotation circleAnnotation = new Annotation(circle);
        Annotation rectAnnotation = new Annotation(rect);
        AnnotatedImage image = new AnnotatedImage("Image", new Annotation[] {circleAnnotation, rectAnnotation});
        System.out.print(Arrays.toString(image.getAnnotations()));
    }
}
