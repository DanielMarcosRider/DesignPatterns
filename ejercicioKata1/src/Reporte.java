public abstract class Reporte  implements AccionesReporte{
    protected String contenido;
    @Override
    public abstract void generarReporte(String info);
    @Override
    public abstract void imprimirReporte();
}