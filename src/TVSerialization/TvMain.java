package TVSerialization;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TvMain {
    private ArrayList<TvSeries> shows = new ArrayList<>();
    Scanner myScan = new Scanner(System.in);

    public TvMain() {
        //createShowData();
        //write2File();
        readFromFile();
        startProgram();

    }

    private void startProgram() {
        boolean keepGoing = true;
        int ans;

        do {
            System.out.println("you have the following TV shows");
            int i;
            for (i = 1; i < shows.size() + 1; i++) {
                System.out.print(i + ") ");
                shows.get(i).printInfo();
            }
            System.out.println(i++ + ") None, I Quit");
            System.out.println("Which show do you wnat to work with");

            ans = myScan.nextInt();
            myScan.nextLine();

            if (ans >= i || ans < 0) {

            }


        } while (keepGoing);
    }

    private void createShowData() {
        Random rand = new Random();
        String[] showNames = {"Doctor Who", "Stargate: Atlantis", "Castlvania", "One Piece", "CSI"};
        TvSeries tvShow;
        for (String name : showNames) {
            tvShow = new TvSeries(name);
            shows.add(tvShow);
            tvShow.changeRating(rand.nextInt(1, 6));
            tvShow.addEpisodes(rand.nextInt(1, 24), rand.nextInt(1, 6));
        }

    }

    public void write2File() {
        try {
            FileOutputStream fileOUt = new FileOutputStream("./src/TVSerialization/TVSerializationTVShows.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOUt);

            objectOut.writeObject(shows);

            fileOUt.close();
            objectOut.close();

            System.out.println("all object have been written");

        } catch (IOException error) {
            System.out.println("could not write to file");
        }
    }

    public void readFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream("./src/TVSerialization/TVSerializationTVShows.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            shows = (ArrayList<TvSeries>) objectIn.readObject();

            fileIn.close();
            objectIn.close();

            System.out.println("all object have been written");

        } catch (IOException error) {
            System.out.println("could not write to file");
        } catch (ClassNotFoundException e) {
            System.out.println("no such class found");
        }
    }
}
