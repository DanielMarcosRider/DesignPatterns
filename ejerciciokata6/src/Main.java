public class Main {
    public static void main(String[] args) {
        Avenger ironMan = new Avenger.Builder("Tony Stark", "Iron Man")
                .poder("Genio, multimillonario, playboy, filántropo")
                .armaPrincipal("Traje de Iron Man")
                .universo("Marvel")
                .build();

        Avenger thor = new Avenger.Builder("Thor Odinson", "Thor")
                .poder("Dios del Trueno")
                .armaPrincipal("Mjolnir")
                .universo("Marvel")
                .build();

        Avenger hulk = new Avenger.Builder("Bruce Banner", "Hulk")
                .poder("Radiación Gamma")
                .armaPrincipal("Puños")
                .universo("Marvel")
                .build();

        System.out.println("Avenger: " + ironMan.getAlias() + ", Universo: " + ironMan.getUniverso());
        System.out.println("Avenger: " + thor.getAlias() + ", Universo: " + thor.getUniverso());
        System.out.println("Avenger: " + hulk.getAlias() + ", Poder: " + hulk.getPoder() + ", Universo: " + hulk.getUniverso());
    }
}