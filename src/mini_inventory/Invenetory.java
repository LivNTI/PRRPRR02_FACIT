package mini_inventory;

import java.util.ArrayList;

public class Invenetory {
    //attributes
    public ArrayList<Item> items = new ArrayList<>();


    //constructor
    public Invenetory() {
        items.add(new Weapon("Butter knife", 10));
        items.add(new Consumable(5, "Good soup"));

    }

    //methods
    public void display() {
        System.out.println("Current items in the backpack are:");
        for (Item item : items) {
            System.out.println(item.name);


        }
    }

}


//author: LivNTI