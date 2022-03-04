package edu.poniperro.items;

public class NormalItem extends Item{

    public NormalItem(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void update_q() {
        if(getSellIn() <= 0){
            recalcularQuality(-2);
        }
        else {
            recalcularQuality(-1);
        }
        setSellIn(getSellIn() - 1);
    }
}
