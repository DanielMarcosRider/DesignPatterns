public class Pastel implements ArticuloDulce{
    @Override
    public void preparar() {
        System.out.println("Estamos preparando el Pastel");
    }

    @Override
    public void empaquetar() {
        System.out.println("Estamos empaquetando el Pastel");
    }
}
