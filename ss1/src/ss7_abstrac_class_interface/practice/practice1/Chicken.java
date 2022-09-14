package ss7_abstrac_class_interface.practice.practice1;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeShow() {
        return "Tiếng gà kêu: chít chít";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
