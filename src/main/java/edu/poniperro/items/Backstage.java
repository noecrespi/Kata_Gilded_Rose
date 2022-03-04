package edu.poniperro.items;

public class Backstage extends Item{

    //Constructor
    public Backstage (String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void update_q() {
        if (getSellIn() > 10){
            recalcularQuality(1);
        }
        if (getSellIn() < 10){
            recalcularQuality(2);
        }
        if (getSellIn() < 5){
            recalcularQuality(3);
        }
        else {
            setQuality(0);
        }
        setSellIn(getSellIn() -1);
    }
}
