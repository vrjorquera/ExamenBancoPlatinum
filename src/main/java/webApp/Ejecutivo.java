package webApp;

public class Ejecutivo {
    private String rut;
    private String nombre;
    private String departamento;

    // Constructor
    public Ejecutivo(String rut, String nombre, String departamento) {
        this.rut = rut;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Getters y Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}