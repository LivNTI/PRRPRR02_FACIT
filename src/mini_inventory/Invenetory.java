package mini_inventory;

import java.util.ArrayList;

public class Invenetory {
    //attributes
    public ArrayList<Item> items = new ArrayList<>();

    //constructor
    public Invenetory() {
        items.add(new Weapon());
        
    }

    //methods
    public void display() {
        System.out.println("Current items in the backpack are:");
        for (Item item : items) {
            System.out.println(item.name);

        }
    }

}
