package edu.teamRocket.domain;

public class Conjured extends NormalItem{
    public Conjured(String name, int sell_In, int quality) {
        super(name, sell_In, quality);
    }

    @Override
    public void updateQuality() {
        if (getSell_in() > 0) {
            computeQuality(-2);
        }
        else {
            computeQuality(-4);
        }
        setSell_in();
    }
}
