package ss7_abstrac_class_interface.exercise.exercise1;

public class Square extends Shape implements Resizeable, Colorable{
    private double angle;

    public Square() {
    }

    public Square(double angle,String color, boolean filled ) {
        super(color, filled);
        this.angle = angle;
    }

    public Square(double angle) {
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    public double getArea(){
        return this.angle*this.angle;
    }

    @Override
    public String toString() {
        return "Diện tích hình vuông: " + getArea()
                ;
    }

    @Override
    public void Resize(double percent) {

    }

    @Override
    public void howToColor() {

    }
}
