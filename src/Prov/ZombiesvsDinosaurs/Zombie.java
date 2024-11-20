package Prov.ZombiesvsDinosaurs;

/*
 * Class to manage and create Zombies
 * attributes ar randomly generated
 * Zombies have high strength and low intelligence
 */
public class Zombie extends Creature {

    public Zombie() {
        strength = rand.nextInt(25, 101);
        intelligence = rand.nextInt(1, 51);
        durability = rand.nextInt(1, 76);
    }

}


//@author LivNTI