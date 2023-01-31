public class UserAninmal extends Animal {
    public String name;
    public String food;
    public String covering;
    public String voice;
    public String fly;
    public static Integer Legs;

    public UserAninmal(String name, String food, String covering, String voice, String fly, Integer legs) {
        this.name = name;
        this.food = food;
        this.covering = covering;
        this.fly = fly;
        this.voice = voice;
        Legs = legs;
        setCovering(covering);

        if (fly.toLowerCase().equals("yes")) {
            setFlyingType(new CanFly());
        } else {
            setFlyingType(new CantFly());
        }
        if (legs.equals(4)) {
            setWalkingType(new FourLegs());
        } else if (legs.equals(2)) {
            setWalkingType(new TwoLegs());
        } else {
            setWalkingType(new NoLegs());
        }
    }

    public static void setLegs(Integer legs) {
        UserAninmal.Legs = legs;
    }

    @Override
    public String speak() {
        return this.voice;
    }

    @Override
    public String eat() {
        return this.food;
    }
}
