
public class BlackTea extends TeaBeverages {

    int price = 0;

    public BlackTea(boolean hasLemon, int size) {
        super(hasLemon, size);
        this.calculateCost();
        if (hasLemon){
            this.price++;
        }
    }

    @Override
    public void calculateCost() {
        if (this.size == 1){
            this.price = 3;
        }
        else if (this.size == 2){
            this.price = 4;
        }
        else if (this.size == 3){
            this.price = 5;
        }
    }

    @Override
    public int cost() {
        return this.price;
    }

    public String getName(){
        return "Black Tea";
    }
}
