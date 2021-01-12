public class Americano extends CaffeineBeverages{

    int price = 0;

    public Americano(boolean hasMilk, int size) {
        super(hasMilk, size);
        this.calculateCost();
        if (hasMilk){
            this.price++;
        }
    }

    @Override
    public void calculateCost() {
        if (this.size == 1){
            this.price = 7;
        }
        else if (this.size == 2){
            this.price = 8;
        }
        else if (this.size == 3){
            this.price = 9;
        }
    }

    @Override
    public int cost() {
        return this.price;
    }

    public String getName(){
        return "Americano";
    }
}
