public class Turtle extends Animal{
    public Turtle() {
        setCovering("shell");
        setFlyingType(new CantFly());
        setWalkingType(new FourLegs());
    }

    @Override
    public String speak() {
        return "biting";
    }

    @Override
    public String eat() {
        return "vegetables";
    }
}
