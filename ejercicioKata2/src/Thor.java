public class Thor extends Avenger{

    @Override
    public void atacar() {
        System.out.println("Martillazo");
    }

    @Override
    public void defender() {
        System.out.println("Rayo protector");
    }

    @Override
    public void mostrarIdentidad(String nombre, String alias, String ataque, String defensa) {
        super.mostrarIdentidad(nombre, alias, ataque, defensa);
    }
}
