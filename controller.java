// Controller Design
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

// Controller class that coordinates everything
class RestaurantController {
    private Order order;
    private Chef chef;

    public RestaurantController() {
        this.order = new Order();
        this.chef = new Chef();
    }

    public void handleOrder() {
        order.prepareOrder();
        chef.cook();
    }
}

// Main class
public class controller {
    public static void main(String[] args) {
        RestaurantController controller = new RestaurantController();
        controller.handleOrder();  // Controller handles the flow
    }
}