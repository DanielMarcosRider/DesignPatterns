public class ThorAdapter implements Avenger{
    private Thor thor;
    public ThorAdapter(Thor thor) {
        this.thor = thor;
    }

    @Override
    public void atacar() {
        thor.ataqueConMartillo();
        //System.out.println("Thor ataca con Mjolnir");
    }
}
