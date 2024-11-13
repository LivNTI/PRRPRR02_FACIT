package mini_inventory;

import java.util.Random;

public class Weapon extends Item {
    //attributes
    public int minDamage = 0;
    public int maxDamage = 0;


    //contructors
    public Weapon() {


    }

    //methods
    public int attack() {
        Random gen = new Random();
        int damage = gen.nextInt(minDamage, maxDamage + 1);

        return damage;
    }
}
