import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> shopItems;
    String name;

    public Shop(String name) {
        this.name = name;
        this.shopItems = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void addItem(ISell item) {
        this.shopItems.add(item);
    }

    public  void removeItem(ISell item) {
        this.shopItems.remove(item);
    }

    public int noOfItems() {
        return this.shopItems.size();
    }

    public double calcTotalPotentialProfit() {

        double totalProfit = 0;
        for (ISell item : this.shopItems) {
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }
}
