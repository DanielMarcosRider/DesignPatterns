import beans.Usuario;
import coleccion.ColeccionUsuarios;

public class Main {
    public static void main(String[] args) {

        ColeccionUsuarios usuarios = new ColeccionUsuarios();
        ColeccionUsuarios coleccionUsuarios = new ColeccionUsuarios();

        Usuario usuario = new Usuario();
        Usuario usuario2 = new Usuario();
        Usuario usuario3 = new Usuario();
        Usuario usuario4 = new Usuario();
        Usuario usuario5 = new Usuario();
        Usuario usuario6 = new Usuario();
        Usuario usuario7 = new Usuario();
        Usuario usuario8 = new Usuario();
        Usuario usuario9 = new Usuario();
        Usuario usuario10 = new Usuario();

        usuarios.anadirUsuario(usuario);
        usuarios.anadirUsuario(usuario2);
        usuarios.anadirUsuario(usuario3);
        usuarios.anadirUsuario(usuario4);
        usuarios.anadirUsuario(usuario5);
        usuarios.anadirUsuario(usuario6);
        usuarios.anadirUsuario(usuario7);
        usuarios.anadirUsuario(usuario8);
        usuarios.anadirUsuario(usuario9);
        usuarios.anadirUsuario(usuario10);

        usuario.setIdUsuario(1);
        usuario.setNombre("");
        usuario.setApellido1("");
        usuario.setApellido2("Hola");
        usuario.setEdad(21);
        usuario.setDireccion("");
    }
}