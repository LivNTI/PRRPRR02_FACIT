package AtTheRaces;

public class Horse {
    String name;
    float probability;

    public Horse(String theName, String odds) {
        name = theName;

        int colonIndex = odds.indexOf(':');
        String theOddsNumber = odds.substring(0, colonIndex);
        int number = Integer.valueOf(theOddsNumber);

        probability = 1 / number;

    }

}
