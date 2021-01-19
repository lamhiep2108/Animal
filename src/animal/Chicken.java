package animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "chiken cuck-cuck";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
