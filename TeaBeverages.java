
public abstract class TeaBeverages extends Beverage{
    boolean hasLemon;
    int size;
    int price =0;

    public TeaBeverages(boolean hasLemon, int size){
        this.size = size;
        this.hasLemon = hasLemon;
    }


    public abstract String getName();

    @Override
    public String toString() {
        return (this.size==1 ? " Small " : (this.size == 2 ? " Medium ":" Large "))+ this.getName() + (this.hasLemon ? " with Lemon " : " without Lemon ");
    }
}
