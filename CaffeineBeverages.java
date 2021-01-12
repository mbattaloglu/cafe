
public abstract class CaffeineBeverages extends Beverage {
    boolean hasMilk;
    int size;
    int price = 0;
    public CaffeineBeverages(boolean hasMilk, int size){
        this.size = size;
        this.hasMilk = hasMilk;
    }


    public abstract String getName();

    @Override
    public String toString() {
        return (this.size==1 ? " Small" : (this.size == 2 ? " Medium":" Large")) + " " + this.getName() + (this.hasMilk ? " with Milk " : " without Milk ");
    }
}
