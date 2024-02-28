public class Main {
    public static void main(String[] args) {
        GenerarReporteTexto rTexto = new GenerarReporteTexto();
        GenerarReporteHTML rHTML = new GenerarReporteHTML();

        rTexto.generarReporte("Hola");
        rTexto.imprimirReporte();

        rHTML.generarReporte("33");
        rHTML.imprimirReporte();
    }
}