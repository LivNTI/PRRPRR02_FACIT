package Prov.ZombiesvsDinosaurs;

/*
 * Class to manage and create Creatures
 * attribute values are assigned by the subclasses
 *
 */

import java.util.Random;

public class Creature {
    protected int strength;
    protected int durability;
    protected int intelligence;
    protected int maxValue = 40;
    protected Random rand = new Random();

    /*
     * Play chess depends on the creatures intelligence.
     * The return value cannot exceed the max value
     */
    public int playChess() {
        int returnValue = rand.nextInt(10) + intelligence;
        if (returnValue > maxValue) {
            returnValue = maxValue;
        }
        return returnValue;
    }

    /*
     * Wrestle depends on the creatures strength and durablity.
     * The return value cannot exceed the max value
     */
    public int wrestle() {
        int returnValue = rand.nextInt(20) + strength + durability;
        if (returnValue > maxValue) {
            returnValue = maxValue;
        }
        return returnValue;
    }

    /*
     * ArmWrestle depends on the creatures strength.
     * The return value cannot exceed the max value
     */
    public int armWrestle() {
        int returnValue = rand.nextInt(5) + strength;
        if (returnValue > maxValue) {
            returnValue = maxValue;
        }
        return returnValue;
    }
}


//@author LivNTI