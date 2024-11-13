package mini_inventory;

public class Consumable extends Item {
    //attributes
    public int usesMax = 0;
    public int usesCurretn = 0;

    //contructors
    public Consumable(int usesMax, String name) {
        this.usesMax = usesMax;
        this.name = name;
    }

    //methods
    public void use(Character target) {
        if (usesCurretn < usesMax) {
            System.out.println(target.name + " uses " + this.name);
            target.hp += 10;
            usesCurretn--;
        }
    }
}


//author: LivNTI