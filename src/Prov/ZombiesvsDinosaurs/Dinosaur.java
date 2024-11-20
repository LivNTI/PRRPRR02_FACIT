package Prov.ZombiesvsDinosaurs;

/*
 * Class to manage and create Dinosaurs
 * attributes ar randomly generated
 * Dinosaurs have low strength and high intelligence
 */

public class Dinosaur extends Creature {

    public Dinosaur() {
        strength = rand.nextInt(1, 51);
        intelligence = rand.nextInt(25, 101);
        durability = rand.nextInt(1, 76);
    }
}


//@author LivNTI