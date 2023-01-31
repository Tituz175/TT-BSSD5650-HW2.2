public interface IFlys {
    String fly();
}

class CanFly implements IFlys {

    @Override
    public String fly() {
        return "is flying";
    }
}

class CantFly implements IFlys {

    @Override
    public String fly() {
        return "remains on the ground";
    }
}
