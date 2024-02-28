public class IronManAdapter implements Avenger{
    private IronMan ironMan;
    public IronManAdapter(IronMan ironMan) {
        this.ironMan = ironMan;
    }

    @Override
    public void atacar() {
        ironMan.realizarAtaque();
        // System.out.println("Iron Man ataca con sus repulsores");
    }
}
