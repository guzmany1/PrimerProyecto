public class Material {
    private String nombre;
    private String tipo;
    private int cantidad;
    private String proveedor;
    private double precio;
    private String descripcion;

    public Material(String nombre, String tipo, int cantidad, String proveedor, double precio, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Material{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", proveedor='" + proveedor + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

}