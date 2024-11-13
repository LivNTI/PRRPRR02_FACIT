package TVSerialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class TvSeries implements Serializable {
    private String name;
    private ArrayList<Integer> episodes = new ArrayList<>();
    private int rating;

    public TvSeries() {
        Scanner myScan = new Scanner(System.in);
        System.out.print("what is the name of the TV show? ");
        name = myScan.nextLine();
    }

    public TvSeries(String inName) {
        name = inName;
    }

    public void changeRating(int newRating) {
        rating = newRating;
    }

    public void addEpisodes(int numOfEpisodes, int season) {
        if (season > episodes.size()) {
            for (int i = 0; i < season - 1; i++) {
                episodes.add(0);
            }
        }
        episodes.add(season - 1, numOfEpisodes);
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Rating: " + rating);
    }
}


// @author LivNTI