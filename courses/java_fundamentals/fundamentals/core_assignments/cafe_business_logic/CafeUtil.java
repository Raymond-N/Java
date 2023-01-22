import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for(int i = 0; i < 11; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems) {
        double total = 0;
        for(double price : lineItems) {
            total = price + total;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu) {
        for(int i = 0; i < menu.size(); i++) {
            System.out.println(i + " " + menu.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");

        // Worked on my idea a bit more and updated conditional statement

        if(customers.size()==0) {
            System.out.println("You are first in line.");
        }
        else if(customers.size()==1) {
            System.out.println("There is " + customers.size() + " person in front of you.");
        }
        else {
            System.out.println("There are " + customers.size() + " people in front of you.");
        }

        customers.add(userName);
        System.out.println(customers);

        // Tried to get fancy here and couldn't get it to work! =(
        /*for(int i = 0; i < 4; i ++) {
            System.out.println(i);

        if(customers.get(i) > 1) {
            System.out.println("There are " + customers.get(i) + " people in front of you.");
                break;
        }
        else if(customers.get(i) == 1) {
            System.out.println("There is " + customers.get(i) + " person in front of you.");
                break;
        }
        else {
            System.out.println("You are first in line!");
                break;
        }
        }*/
    }
}