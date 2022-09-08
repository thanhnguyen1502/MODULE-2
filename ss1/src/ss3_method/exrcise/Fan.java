package ss3_method.exrcise;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on==true) {
            return "Fan{" +
                    ", speed=" + speed +
                    ", color='" + color +
                    ", radius=" + radius + " fan is on ! " +
                    '}';
        }else {
            return "Fan{" +
                    ", color='" + color +
                    ", radius=" + radius + " fan is off ! " +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(10,true,1.5,"yellow");
        Fan fan2 = new Fan(5,false,1.5,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}