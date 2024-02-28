public class IronMan extends Avenger{

    @Override
    public void atacar() {
        System.out.println("Rayo Laser");
    }

    @Override
    public void defender() {
        System.out.println("Escudo nanorobotico");
    }

    @Override
    public void mostrarIdentidad(String nombre, String alias) {
        super.mostrarIdentidad(nombre, alias);
    }
}
