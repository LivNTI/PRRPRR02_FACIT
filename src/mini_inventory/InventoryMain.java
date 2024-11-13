package mini_inventory;

import java.util.Scanner;

public class InventoryMain {
    public static void main(String[] args) {
        System.out.println("welcome to the inventory manangemnet system");
        Scanner s = new Scanner(System.in);
        System.out.println("Let's creata an inventory for a charcter");
        Character liv = new Character();
        liv.backpack.display();
        System.out.println(liv.name + " has found a helmet on the ground. Do they want to pick it up? (Y/N)");
        String ans = s.nextLine();
        if (ans.toLowerCase().equals("y") || ans.equals("Yes")) {
            liv.backpack.items.add(new Armour("Diamond Helmet", 42));
            System.out.println(liv.name + " now has more things in their inventory");
            liv.backpack.display();
        } else {
            System.out.println(liv.name + " ignores the helmet and walks away");
        }
    }
}


//author:LivNTI