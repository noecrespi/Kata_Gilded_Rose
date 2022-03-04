package edu.poniperro.items;

public abstract class Item implements Updateable{

    //Atributos
    private final String name;
    private int quality;
    private int sellIn;

    //Constructor
    public Item(String name, int quality, int sellIn) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public String getName() {
        return name;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void recalcularQuality(int cantidad){
        if(getQuality() + cantidad > 0){
            setQuality(getQuality() + cantidad);
        }
        else {
            setQuality(0);
        }
    }

    @Override
    public String toString(){
        return getName() +  " " + getQuality() + " " + getSellIn();
    };

}
