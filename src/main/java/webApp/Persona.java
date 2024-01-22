package webApp;

public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;

    // Constructor
    public Persona(String rut, String nombre, String apellido, String direccion, String correo, String telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
}
