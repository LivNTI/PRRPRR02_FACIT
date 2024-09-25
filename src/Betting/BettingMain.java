package Betting;

public class BettingMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Race");
        //creates the better
        Better theBetter = new Better("BetBig", 500);

        //creates the competers
        Horse firstHorse = new Horse("Secriteriat", 0.7);
        Horse secondHorse = new Horse("Black Beauty", 0.5);

    }
}
