package edu.teamRocket.domain;

class Item {
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
        StringBuilder itemInfo = new StringBuilder();
        itemInfo.append("Item: ")
                .append(getName())
                .append(" | Sell In: ")
                .append(getSellIn())
                .append(" | Quality: ")
                .append(getQuality());
        return itemInfo.toString();
    }
}
