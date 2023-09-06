package Logic;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String id;
    private String primerNombre;
    private String primerApellido;
    private String segundoApellido;
    private String numeroTelefono;

    private List<String> usuarios = new ArrayList<>();

    public Usuario(String id, String primerNombre, String primerApellido, String segundoApellido, String numeroTelefono) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.numeroTelefono = numeroTelefono;
    }

    public void addUsuario(String nombreUsuario) {
        usuarios.add(nombreUsuario);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
