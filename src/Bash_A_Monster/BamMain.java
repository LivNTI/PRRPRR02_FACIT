package Bash_A_Monster;

public class BamMain {
    public static void main(String[] args) {
        //create the Hero and Enemy object
        Hero theHero = new Hero();
        Enemy theEnemy = new Enemy();

        // Give the Hero object its name value
        theHero.name = "Good Guy";

        // Give the Enemy object its name value
        theEnemy.name = "Bad Guy";

        System.out.println(theHero.name + " meets " + theEnemy.name + " who has " + theEnemy.hp + " hp");

        theEnemy.hp -= 10;

        System.out.println(theHero.name + " hits " + theEnemy.name);
        System.out.println(theEnemy.name + " has " + theEnemy.hp + " hp Left");


    }
}
