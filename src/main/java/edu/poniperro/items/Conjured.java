package edu.poniperro.items;

public class Conjured extends Item{


    public Conjured(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void update_q() {
        if(getSellIn() <= 0){
            recalcularQuality(-4);
        }
        else {
            recalcularQuality(-2);
        }
        setSellIn(getSellIn() - 1);
    }
}
