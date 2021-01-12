
public class Capucino extends CaffeineBeverages {

    int price;

    public Capucino(boolean hasMilk, int size) {
        super(hasMilk, size);
        this.calculateCost();
        if (hasMilk){
            this.price++;
        }
    }

    @Override
    public void calculateCost() {
        if (this.size == 1){
            this.price = 6;
        }
        else if (this.size == 2){
            this.price = 7;
        }
        else if (this.size == 3){
            this.price = 8;
        }
    }

    @Override
    public int cost() {
        return this.price;
    }

    public String getName(){
        return "Capucino";
    }
}
