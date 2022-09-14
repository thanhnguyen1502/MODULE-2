package ss7_abstrac_class_interface.exercise.exercise1;

public abstract class Shape implements Resizeable{
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Màu: "
                + getColor()
                + '\t' + " và "
                + (isFilled() ? "filled" : "not filled");
    }

    public  abstract double getArea();
    @Override
    public void Resize(double percent) {

    }
}
