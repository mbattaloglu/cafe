public class OrderItem implements ICost {

    private int sumCost = 0;
    private Beverage beverage;
    private int amount;

    public OrderItem(Beverage beverage, int amount){
        this.amount = amount;
        this.beverage = beverage;
        calculateCost();
    }
    @Override
    public void calculateCost(){
        sumCost = beverage.cost()*amount;
    }

    @Override
    public int cost(){
        return sumCost;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public int getAmount() {
        return amount;
    }

    public int getSumCost() {
        return sumCost ;
    }
}
