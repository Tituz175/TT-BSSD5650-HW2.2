public class Duck extends Animal {
    public Duck() {
        setCovering("feathers");
        setFlyingType(new CanFly());
        setWalkingType(new TwoLegs());
    }

    @Override
    public String speak() {
        return "quacks";
    }

    @Override
    public String eat() {
        return "ate some bread";
    }
}
