package edu.teamRocket.domain;

public class Item {
    private final String name;
    private int sell_in;
    private int quality;

    Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    String getName() {
        return name;
    }

    int getSell_in() {
        return sell_in;
    }

    void setSell_in(int sell_in) {
        this.sell_in = sell_in;
    }

    int getQuality() {
        return quality;
    }

    void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Item: " + getName() + "\nSell in: " + getSell_in() + "\nQuality: " + getQuality();
    }
}
