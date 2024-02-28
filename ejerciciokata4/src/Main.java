public class Main {
    public static void main(String[] args) {
        AvengersDatabase database = AvengersDatabase.getInstance();
        database.addAvenger("Iron Man");
        database.addAvenger("Thor");
        database.addAvenger("Spider-Man");
        database.deleteAvenger("Spider-Man");

        System.out.println(database.getAvengers());
    }
}