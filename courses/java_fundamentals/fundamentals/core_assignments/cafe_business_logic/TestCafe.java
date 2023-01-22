import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {

    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();

        System.out.println("------- Streak Goal Test -------");
        System.out.println("Purchases needed by week 10: " + appTest.getStreakGoal());

        System.out.println("------- Order Total Test -------");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.println("Order total: " + appTest.getOrderTotal(lineItems));

        System.out.println("------- Display Menu Test -------");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        System.out.println("------- Add Customer Test -------");
        ArrayList<String> customers = new ArrayList<String>();
        for(int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }


    }
}