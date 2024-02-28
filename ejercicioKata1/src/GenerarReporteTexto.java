public class GenerarReporteTexto extends Reporte{
    public void generarReporte(String info){
        super.contenido = "Texto: " + info;
    }

    @Override
    public void imprimirReporte() {
        System.out.println(this.contenido);
    }
}
