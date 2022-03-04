package edu.poniperro;

import edu.poniperro.items.Item;
import edu.poniperro.items.NormalItem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Item normalItem = new NormalItem("Chaleco", 1, 0);
        normalItem.update_q();
        System.out.println(normalItem.getQuality());
    }
}
