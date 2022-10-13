package ss7_abstractclass_interface.practice.practice1;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "ó ó";
    }

    public String howToEat() {
        return "quay";
    }
}
