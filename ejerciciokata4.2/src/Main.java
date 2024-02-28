public class Main {
    public static void main(String[] args) {
            AvengerFactory factory = new AvengerFactory();

            Avenger ironMan = factory.createAvenger("Iron Man");
            Avenger thor = factory.createAvenger("Thor");

            if (ironMan != null) ironMan.display();
            if (thor != null) thor.display();
    }
}