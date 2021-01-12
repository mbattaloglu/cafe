import java.util.Scanner;

public class TestCafe {

    static int milk;
    static int lemon;
    static int amount;
    static boolean check = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        CaffeineBeverages cBeverage;
        TeaBeverages tBeverage;

        System.out.println("Welcome to Cafe!");
        while (check) {
            System.out.println();
            System.out.println("MENU:");
            System.out.println();
            System.out.println("---------------");
            System.out.println("1) Latte");
            System.out.println("2) Capucino");
            System.out.println("3) Americano");
            System.out.println("4) Black Tea");
            System.out.println("5) Green Tea");
            System.out.println("6) Linden Tea");
            System.out.println("---------------");
            System.out.print("What Do You Want?: ");
            int orderNumber = sc.nextInt();
            System.out.println();
            System.out.println("SIZES:");
            System.out.println();
            System.out.println("---------------");
            System.out.println("1) Small");
            System.out.println("2) Medium");
            System.out.println("3) Large");
            System.out.println("---------------");
            System.out.println();
            System.out.print("Please Enter the Size: ");
            int size = sc.nextInt();
            System.out.println();
            if (orderNumber >= 1 && orderNumber <= 3) {
                System.out.println("Do you want to add milk?");
                System.out.print("Enter 1 for adding milk, Enter 2 for not:");
                milk = sc.nextInt();
            } else if (orderNumber >= 4 && orderNumber <= 6) {
                System.out.println("Do you want to add lemon?: ");
                System.out.print("Enter 1 for adding lemon, Enter 2 for not:");
                lemon = sc.nextInt();
            }
            System.out.print("How many you want this drink?: ");
            amount = sc.nextInt();
            switch (orderNumber) {
                case 1:
                    if(milk == 1){
                        cBeverage = new Latte(true, size);
                    }
                    else{
                        cBeverage = new Latte(false, size);
                    }
                    order.add(new OrderItem(cBeverage, amount));
                    break;
                case 2:
                    if(milk == 1){
                        cBeverage = new Capucino(true, size);
                    }
                    else{
                        cBeverage = new Capucino(false, size);
                    }
                    order.add(new OrderItem(cBeverage, amount));
                    break;
                case 3:
                    if(milk == 1){
                        cBeverage = new Americano(true, size);
                    }
                    else{
                        cBeverage = new Americano(false, size);
                    }
                    order.add(new OrderItem(cBeverage, amount));
                    break;
                case 4:
                    if(lemon == 1){
                        tBeverage = new BlackTea(true, size);
                    }
                    else{
                        tBeverage = new BlackTea(false, size);
                    }
                        order.add(new OrderItem(tBeverage, amount));
                    break;
                case 5:
                    if(lemon == 1){
                        tBeverage = new GreenTea(true, size);
                    }
                    else{
                        tBeverage = new GreenTea(false, size);
                    }
                    order.add(new OrderItem(tBeverage, amount));
                    break;
                case 6:
                    if(lemon == 1){
                        tBeverage = new LindenTea(true, size);
                    }
                    else{
                        tBeverage = new LindenTea(false, size);
                    }
                    order.add(new OrderItem(tBeverage, amount));
                    break;
                default:
                    System.out.println("Wrong Input. Try Again");
                    break;
            }
            System.out.println("Do you want to continue?");
            System.out.print("1 for Yes, 2 for No: ");
            if(sc.nextInt() == 2){
                check = false;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Your Orders:");
        System.out.println("--------------");
        System.out.println(order);
        System.out.println("--------------");
        System.out.println("See You Soon!");
        sc.close();
    }
}
