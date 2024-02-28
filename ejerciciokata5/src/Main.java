public class Main {
    public static void main(String[] args) {

        Thor thor = new Thor();
        IronMan ironMan = new IronMan();

        Avenger ironManAdapter = new IronManAdapter(ironMan);
        Avenger thorAdapter = new ThorAdapter(thor);

        ironManAdapter.atacar();
        thorAdapter.atacar();

        // ironMan.realizarAtaque();
        // thor.ataqueConMartillo();
    }
}