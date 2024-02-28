public class GenerarReporteHTML extends Reporte{
    public void generarReporte(String info){
        super.contenido = "<html><body>" + info + "</body></html>";
    }
    @Override
    public void imprimirReporte() {
        System.out.println(this.contenido);
    }
}
