public class AvengerFactory {
    public Avenger createAvenger(String type) {
        switch (type) {
            case "Iron Man":
                return new IronMan();
            case "Thor":
                return new Thor();
            default:
                return null;
        }
    }

}
