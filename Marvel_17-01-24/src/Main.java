public class Main {
    public static void main(String[] args) {
        /*SuperHero s1 = new SuperHero("a", "a");
        s1.luchar();
        */
        //Thor s2 = new Thor("a", "a", "a");
        SuperHero s2 = new Thor("a", "a", "a");
        s2.luchar();
        Thor s4 = (Thor)s2; // CAST o conversión
        s4.getArma();
    }
}