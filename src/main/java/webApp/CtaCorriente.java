package webApp;

public class CtaCorriente {
    private int idCuenta;
    private String rutCliente;
    private double monto;
    private String ejecutivo;

    // Constructor
    public CtaCorriente(int idCuenta, String rutCliente, double monto, String ejecutivo) {
        this.idCuenta = idCuenta;
        this.rutCliente = rutCliente;
        this.monto = monto;
        this.ejecutivo = ejecutivo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public String getRutCliente() {
        return rutCliente;
    }
    
    public double getMonto() {
        return monto;
    }

    public String getEjecutivo() {
        return ejecutivo;
    }
}