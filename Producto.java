public class Producto {
    private String tipoProducto;
    private int cantidad;
    private double precio;
    private boolean existencia;

    public Producto(String tipoProducto, int cantidad, double precio, boolean existencia) {
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

  
    public String toString() {
        return "Producto{" +
                "tipoProducto='" + tipoProducto + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", existencia=" + existencia +
                '}';
    }

}
