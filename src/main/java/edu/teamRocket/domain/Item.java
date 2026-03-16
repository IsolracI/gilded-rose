package edu.teamRocket.domain;

public class Item {
    private final String name;
    private int sellIn;
    private int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    String getName() {
        return name;
    }

    int getSellIn() {
        return sellIn;
    }

    void setSellIn() {
        this.sellIn = this.getSellIn() - 1;
    }

    int getQuality() {
        return quality;
    }

    void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Item: " + getName() + "\nSell in: " + getSellIn() + "\nQuality: " + getQuality();
    }
}
