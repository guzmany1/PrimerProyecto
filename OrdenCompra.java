import java.util.Date;

public class OrdenCompra {
    private Date fechaPedido;
    private int idMateria;
    private double monto;
    private int cantidad;
    private String estadoPedido;

    public OrdenCompra(Date fechaPedido, int idMateria, double monto, int cantidad, String estadoPedido) {
        this.fechaPedido = fechaPedido;
        this.idMateria = idMateria;
        this.monto = monto;
        this.cantidad = cantidad;
        this.estadoPedido = estadoPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
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

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    @Override
    public String toString() {
        return "OrdenCompra{" +
                "fechaPedido=" + fechaPedido +
                ", idMateria=" + idMateria +
                ", monto=" + monto +
                ", cantidad=" + cantidad +
                ", estadoPedido='" + estadoPedido + '\'' +
                '}';
    }

}
