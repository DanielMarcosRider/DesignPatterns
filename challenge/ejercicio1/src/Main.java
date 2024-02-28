public class Main {
    public static void main(String[] args) {
        ConfiguracionCafeteria cafeteria1 = ConfiguracionCafeteria.getInstance();
        cafeteria1.setNombre("Cafetería Tartaria");
        cafeteria1.setHorario("8:00 - 16:00");
        cafeteria1.setServicioDomicilio("No");

        cafeteria1.addCafeteria("Cafeteria Tartaria");

        System.out.println(ConfiguracionCafeteria.getInstance().getCafeteria());
        System.out.println(ConfiguracionCafeteria.getInstance().getHorario());
    }
}