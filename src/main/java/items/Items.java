package items;

import behaviours.ISell;

public abstract class Items implements ISell {
    String description;
    double costPrice;
    double salePrice;

    public Items(String description, double costPrice, double salePrice) {
        this.description = description;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double calculateMarkup() {
        return this.salePrice - this.costPrice;
    }
}
