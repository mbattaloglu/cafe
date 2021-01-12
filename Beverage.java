
public abstract class Beverage implements ICost{

    public static int SMALL = 1;
    public static int MEDIUM = 2;
    public static int LARGE = 3;

    @Override
    public abstract int cost();
    @Override
    public abstract void calculateCost();
}
