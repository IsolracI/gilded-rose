package edu.teamRocket.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private final List<Updateable> inventory = new ArrayList<Updateable>();

    public GildedRose() {}

    public List<Updateable> inventory() {
        return this.inventory;
    }

    public void addItem(Updateable item) {
        inventory().add(item);
    }

    public void updateQuality() {
        for (Updateable item : inventory()) {
            item.updateQuality();
        }
    }

    @Override
    public String toString() {
        StringBuilder inventory = new StringBuilder();
        for (Updateable item : inventory()) {
            inventory.append(item.toString());
        }
        return inventory.toString();
    }
}
