
public class Latte extends CaffeineBeverages{

    int price = 0;

    public Latte(boolean hasMilk, int size) {
        super(hasMilk, size);
        this.calculateCost();
        if (hasMilk){
            this.price++;
        }
    }


    @Override
    public void calculateCost() {
        if (this.size == 1){
            this.price = 5;
        }
        else if (this.size == 2){
            this.price = 6;
        }
        else if (this.size == 3){
            this.price = 7;
        }
    }

    @Override
    public int cost() {
       return this.price;
    }

    public String getName(){
        return "Latte";
    }
}
