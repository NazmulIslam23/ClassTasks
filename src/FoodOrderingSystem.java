// Base Class
class Restaurant {
    protected double taxRate = 0.10;

    public double calculateTotalBill(double foodPrice) {
        return foodPrice + (foodPrice * taxRate);
    }

    public int estimateDeliveryTime() {
        return 40;
    }
}

class FastFoodRestaurant extends Restaurant {
    public FastFoodRestaurant() {
        this.taxRate = 0.15; // Override tax rate for fast food
    }

    @Override
    public int estimateDeliveryTime() {
        return 20; // Fast delivery
    }
}

class FineDiningRestaurant extends Restaurant {
    @Override
    public int estimateDeliveryTime() {
        return 60;
    }
}

public class FoodOrderingSystem {
    public static void main(String[] args) {
        Restaurant standardRestaurant = new Restaurant();
        FastFoodRestaurant fastFood = new FastFoodRestaurant();
        FineDiningRestaurant fineDining = new FineDiningRestaurant();

        double foodPrice = 100.0;

        System.out.println("Standard Restaurant:");
        System.out.println("Total Bill: $" + standardRestaurant.calculateTotalBill(foodPrice));
        System.out.println("Delivery Time: " + standardRestaurant.estimateDeliveryTime() + " minutes\n");

        System.out.println("Fast Food Restaurant:");
        System.out.println("Total Bill: $" + fastFood.calculateTotalBill(foodPrice));
        System.out.println("Delivery Time: " + fastFood.estimateDeliveryTime() + " minutes\n");

        System.out.println("Fine Dining Restaurant:");
        System.out.println("Total Bill: $" + fineDining.calculateTotalBill(foodPrice));
        System.out.println("Delivery Time: " + fineDining.estimateDeliveryTime() + " minutes");
    }
}
