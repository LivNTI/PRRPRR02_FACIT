package mini_inventory;

import java.util.Scanner;

public class Character {
    //attributes
    public String name;
    public int hp;
    public Invenetory backpack;

    //Constructor
    public Character() {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your characters name?");
        name = s.nextLine();
        backpack = new Invenetory();


    }

}
