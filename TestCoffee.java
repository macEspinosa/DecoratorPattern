public class TestCoffee {
    public static void main(String[] args) {
        // Basic Black Coffee
        Coffee coffee1 = new BlackCoffee();
        System.out.println("Order 1: " + coffee1.getDescription());
        System.out.println("Cost: ₱" + coffee1.getCost());
        
        // Black Coffee with Milk
        Coffee coffee2 = new Milk(new BlackCoffee());
        System.out.println("\nOrder 2: " + coffee2.getDescription());
        System.out.println("Cost: ₱" + coffee2.getCost());
        
        // Black Coffee with Caramel Syrup
        Coffee coffee3 = new CaramelSyrup(new BlackCoffee());
        System.out.println("\nOrder 3: " + coffee3.getDescription());
        System.out.println("Cost: ₱" + coffee3.getCost());
        
        // Black Coffee with Milk AND Caramel Syrup
        Coffee coffee4 = new CaramelSyrup(new Milk(new BlackCoffee()));
        System.out.println("\nOrder 4: " + coffee4.getDescription());
        System.out.println("Cost: ₱" + coffee4.getCost());
    }
}