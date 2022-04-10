import java.util.ArrayList;
public class Invoice {
    private String name;
    private double price;
    private double total_cost;

    public Invoice(String nm, double pri) {
        name = nm;
        price = pri;
        total_cost = 0;
    }


    public String getname() {
        return name;
    }

    public double getprice() {
        return price;
    }

    public double gettotal_cost() {
        return total_cost;
    }


    public void setname(String n) {
        name = n;
    }

    public void setprice(double pri) {
        price = pri;
        total();
    }

    public void total() {
        total_cost = price;
    }

    public void displayLine() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + total_cost);
    }
}