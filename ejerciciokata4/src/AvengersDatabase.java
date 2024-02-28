import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class AvengersDatabase {
    private static AvengersDatabase instance;
    private final List<String> avengers;

    private AvengersDatabase() {
        avengers = new ArrayList<>();
    }

    public static AvengersDatabase getInstance() {
        if (instance == null) {
            instance = new AvengersDatabase();
        }
        return instance;
    }

    public void addAvenger(String avenger) {
        avengers.add(avenger);
    }
    public void deleteAvenger(String avenger){
        avengers.remove(avenger);
    }
    public void findAvenger(String name){
        avengers.stream().findAny();
    }

    public List<String> getAvengers() {
        return avengers;
    }
}