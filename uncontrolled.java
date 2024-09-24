public class uncontrolled {

    // Non-Controller Design
class Order {
    public void prepareOrder() {
        System.out.println("Order is being prepared.");
    }
}

class Chef {
    public void cook() {
        System.out.println("Chef is cooking the meal.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.prepareOrder();

        Chef chef = new Chef();
        chef.cook();
    }
}
}
