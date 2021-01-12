
public class GreenTea extends TeaBeverages {

    int price = 0;

    public GreenTea(boolean hasLemon, int size) {
        super(hasLemon, size);
        this.calculateCost();
        if (hasLemon){
            this.price++;
        }
    }

    @Override
    public void calculateCost() {
        if (this.size == 1){
            this.price = 4;
        }
        else if (this.size == 2){
            this.price = 5;
        }
        else if (this.size == 3){
            this.price = 6;
        }
    }

    @Override
    public int cost() {
        return this.price;
    }
    public String getName(){
        return "Green Tea";
    }
}
