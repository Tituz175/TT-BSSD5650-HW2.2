public interface IWalks {
    String walk();
}

class TwoLegs implements IWalks {

    @Override
    public String walk() {
        return "Walks with two legs";
    }
}

class FourLegs implements IWalks {

    @Override
    public String walk() {
        return "Walks with four legs";
    }
}

class NoLegs implements IWalks {

    @Override
    public String walk() {
        return "Don't have legs to walk";
    }
}
