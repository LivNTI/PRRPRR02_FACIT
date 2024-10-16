package TVSerialization;

import java.io.*;
import java.util.ArrayList;

public class TvMain {
    private ArrayList<TvSeries> shows = new ArrayList<>();

    public TvMain() {
        createShowData();
        write2File();

    }

    private void createShowData() {
    }

    public void write2File() {
        try {
            FileOutputStream fileOUt = new FileOutputStream("./TVSerializationTVShows.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOUt);

            for (TvSeries aShow : shows) {
                objectOut.writeObject(aShow);
            }

            fileOUt.close();
            objectOut.close();

            System.out.println("all object have been written");

        } catch (IOException error) {
            System.out.println("could not write to file");
        }
    }

    public void readFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream("./TVSerializationTVShows.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            try {
                while (true) {

                    shows.add((TvSeries) objectIn.readObject());
                }

            } catch (Exception error) {
                System.out.println("No more objects");
            }
            fileIn.close();
            objectIn.close();

            System.out.println("all object have been written");

        } catch (IOException error) {
            System.out.println("could not write to file");
        }
    }
}
