package edu.teamRocket.domain;

public class NormalItem implements Updateable {
    private final Item item;

    public NormalItem(String name, int sell_In, int quality) {
        this.item =  new Item(name, sell_In, quality);
    }

    Item getItem() {
        return this.item;
    }

    public String getName() {
        return this.item.getName();
    }

    public int getSell_in() {
        return this.item.getSellIn();
    }

    void setSell_in() {
        this.item.setSellIn();
    }

    public int getQuality() {
        return this.item.getQuality();
    }

    void computeQuality(int value) {

        if (getQuality() + value > 50) {
            item.setQuality(50);
        }
        else if (getQuality() + value >= 0) {
            item.setQuality(getQuality() + value);
        }
        else {
            item.setQuality(0);
        }
    }

    @Override
    public void updateQuality() {

        if (getSell_in() > 0) {
            computeQuality(-1);
        }
        else {
            computeQuality(-2);
        }
        setSell_in();
    }

    @Override
    public String toString() {
        return this.item.toString();
    }

}
