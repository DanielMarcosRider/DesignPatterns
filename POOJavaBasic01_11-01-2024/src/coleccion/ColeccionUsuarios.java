package coleccion;

import beans.Usuario;

public class ColeccionUsuarios {
    private Usuario[] lstUsuario;
    private int numUser;
    public ColeccionUsuarios(){
        // INICIALIZA LOS ATRIBUTOS
        this.lstUsuario = new Usuario[10];
        this.numUser = 0;       // mejor inicializar la variable en el constructor, no en la declaración de la variable
    }
    // añadir usuario de la lista
    public void anadirUsuario(Usuario usuarioNuevo){
        usuarioNuevo.setIdUsuario(numUser+1);   // 1
        lstUsuario[numUser] = usuarioNuevo;     // cont se usa para hacer el desplazamiento del array
        numUser ++;                             // si no se pone estaria reemplazando los datos en la misma posicion
    }
    // modificar usuario de la lista
    public void modificarUsuario(Usuario usuarioNuevo){
        /*for (int i = 0; i < lstUsuario.length; i++) {
            Usuario usuario = lstUsuario[i];
        }*/
        for (Usuario usuario: lstUsuario        // Pasa por todos los valores de la lista(posiciones de 0  a n - 1)
             ) {
            if (usuario.getIdUsuario() == usuarioNuevo.getIdUsuario()){     // modificar el usuario que queremos

                usuario.setDireccion(usuarioNuevo.getDireccion());
                usuario.setNombre(usuarioNuevo.getNombre());
                usuario.setApellido1(usuarioNuevo.getApellido1());
                usuario.setApellido2(usuarioNuevo.getApellido2());
                usuario.setEdad(usuarioNuevo.getEdad());
                break;
            }
        }
    }

    // eliminar usuario de la lista
    // listar un usuraio de la lista
    // listar todos los usuarios de la lista

}
