import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ConfiguracionCafeteria {
    private static ConfiguracionCafeteria instance;
    private ArrayList<String> cafeteria;

    private ConfiguracionCafeteria(){
        cafeteria = new ArrayList<>();
    }

    public static ConfiguracionCafeteria getInstance(){
        if (instance==null){
            instance = new ConfiguracionCafeteria();
        }
        return instance;
    }

    private String nombre;
    private String horario;
    private String servicioDomicilio;

    public static void setInstance(ConfiguracionCafeteria instance) {
        ConfiguracionCafeteria.instance = instance;
    }

    public ArrayList<String> getCafeteria() {
        return cafeteria;
    }

    public void addCafeteria(String cafeterias) {
        cafeteria.add(cafeterias);
    }

    public void setCafeteria(ArrayList<String> cafeteria) {
        this.cafeteria = cafeteria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getServicioDomicilio() {
        return servicioDomicilio;
    }

    public void setServicioDomicilio(String servicioDomicilio) {
        this.servicioDomicilio = servicioDomicilio;
    }
}
