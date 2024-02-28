package beans;

public class Usuario {
    // ATRIBUTOS
    private long idUsuario;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String direccion;

    // CONSTRUCTORES
    public Usuario(){
                                    // INSERT
    }
    public Usuario(long idUsuario){
        this.idUsuario = idUsuario; //UPDATE, DELETE
    }
    // FUNCIONES/PROCEDIMIENTOS (MÉTODOS)

    // GETTER / SETTER

    public long getIdUsuario() {
        return this.idUsuario;
    }
    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return this.apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return this.apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
