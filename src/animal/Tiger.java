package animal;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "roarrrrr";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
