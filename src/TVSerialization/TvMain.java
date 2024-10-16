package TVSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
            ObjectOutputStream objectIn = new ObjectOutputStream(fileOUt);

            for (TvSeries aShow : shows) {
                objectIn.writeObject(aShow);
            }

        } catch (IOException error) {
            System.out.println("could not write to file");
        }
    }

    public void readFromFile() {

    }
}
