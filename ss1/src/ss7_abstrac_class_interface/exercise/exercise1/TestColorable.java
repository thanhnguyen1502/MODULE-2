package ss7_abstrac_class_interface.exercise.exercise1;



public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(3.5);
        shapes[2] = new Rectangle(4,6);
        for (Shape shape: shapes) {
            System.out.println(shape + " và hình vuông " + shape.getArea());
            if (shape instanceof Square){
                ((Square) shape).howToColor();
            }
        }

    }
}
