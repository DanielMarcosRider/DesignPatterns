public class Galleta implements ArticuloDulce{
    @Override
    public void preparar() {
        System.out.println("Estamos preparando la Galleta");
    }

    @Override
    public void empaquetar() {
        System.out.println("Estamos empaquetando la Galleta");
    }
}
