package webApp;

public class Transaccion {
    private int id;
    private String rutCliente;
    private String rutDueno;
    private int idCuenta;
    private double montoTransferencia;
    private String cuentaTransferencia;
    private String tipoCuenta;

    // Constructor
    public Transaccion(String rutCliente, String rutDueno, int idCuenta, double montoTransferencia, String cuentaTransferencia, String tipoCuenta) {
        this.rutCliente = rutCliente;
        this.rutDueno = rutDueno;
        this.idCuenta = idCuenta;
        this.montoTransferencia = montoTransferencia;
        this.cuentaTransferencia = cuentaTransferencia;
        this.tipoCuenta = tipoCuenta;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getRutDueno() {
        return rutDueno;
    }

    public void setRutDueno(String rutDueno) {
        this.rutDueno = rutDueno;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public double getMontoTransferencia() {
        return montoTransferencia;
    }

    public void setMontoTransferencia(double montoTransferencia) {
        this.montoTransferencia = montoTransferencia;
    }

    public String getCuentaTransferencia() {
        return cuentaTransferencia;
    }

    public void setCuentaTransferencia(String cuentaTransferencia) {
        this.cuentaTransferencia = cuentaTransferencia;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}