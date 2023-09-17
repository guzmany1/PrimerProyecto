import java.util.Date;

public class OrdenVenta {
    private Date fechaEmision;
    private int numeroCompra;
    private String tipo;
    private double monto;
    private int cantidad;

    public OrdenVenta(Date fechaEmision, int numeroCompra, String tipo, double monto, int cantidad) {
        this.fechaEmision = fechaEmision;
        this.numeroCompra = numeroCompra;
        this.tipo = tipo;
        this.monto = monto;
        this.cantidad = cantidad;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "OrdenVenta{" +
                "fechaEmision=" + fechaEmision +
                ", numeroCompra=" + numeroCompra +
                ", tipo='" + tipo + '\'' +
                ", monto=" + monto +
                ", cantidad=" + cantidad +
                '}';
    }

}
