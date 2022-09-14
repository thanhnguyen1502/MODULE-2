package ss7_abstrac_class_interface.exercise.exercise1;

public class TestShare {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(3,4,"red",false);
        shapes[1] = new Square(3,"pink",true);
        shapes[2] = new Circle(4);

        System.out.println("********************** After resize **********************");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("------------------");
        }

        System.out.println("********************** Before resize **********************");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("------------------");
        }
    }
}
