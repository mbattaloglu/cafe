
import  java.util.ArrayList;
public class Order {

    ArrayList<Beverage> items = new ArrayList<Beverage>();
    ArrayList<Integer> amounts = new ArrayList<Integer>();
    ArrayList<Integer> sumCosts = new ArrayList<Integer>();
    int totalCost = 0;

    public void add(OrderItem orderItem){
        totalCost += orderItem.cost();
        items.add(orderItem.getBeverage());
        amounts.add(orderItem.getAmount());
        sumCosts.add(orderItem.getSumCost());
    }

    public String toString(){
        for (int i = 0;i<amounts.size();i++){
            // numbers.size()=items.size=initialCosts.size()
            System.out.println(amounts.get(i)+ items.get(i).toString()+ sumCosts.get(i) + " TL");
        }
        System.out.print("Total Cost:");
        return Integer.toString(totalCost) + " TL";
    }
}
