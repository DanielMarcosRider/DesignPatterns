public abstract class Avenger implements AccionRealizada {
    public void Avengers(String nombre, String alias){

    }
    protected String nombre;
    protected String alias;

    @Override
    public abstract void atacar();

    @Override
    public abstract void defender();

    public void mostrarIdentidad() {
        System.out.println("El nombre real del Super Heroe " + this.alias + " es: " + this.nombre);
    }
}
