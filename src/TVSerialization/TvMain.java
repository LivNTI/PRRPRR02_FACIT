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
            FileInputStream fileIn = new FileInputStream("./TVSerializationTVShows.ser");
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
