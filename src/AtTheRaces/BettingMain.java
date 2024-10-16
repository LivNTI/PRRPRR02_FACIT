package AtTheRaces;

import java.util.Random;
import java.util.Scanner;

public class BettingMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Race");
        Scanner myScanner = new Scanner(System.in);

        Better theBetter = new Better("BetBig", 500);
        Horse firstHorse = new Horse("Secriteriat", "3:1");

        System.out.println("Howe much do you want to bet?");
        int theBet = myScanner.nextInt();
        myScanner.nextLine();

        Random randomGen = new Random();
        float randomNumber = randomGen.nextFloat();

        if (randomNumber <= firstHorse.probability) {
            System.out.println("congratulations! You have won!");
            theBetter.saldo += theBet;
            System.out.println("Your total amount is now: " + theBetter.saldo);
        }

    }
}


// @author LivNTI