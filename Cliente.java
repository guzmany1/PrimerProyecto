public class Cliente {
    private String nombre;
    private String nit;
    private String telefono;
    private String producto;
    private int cantidad;

    public Cliente(String nombre, String nit, String telefono, String producto, int cantidad) {
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", telefono='" + telefono + '\'' +
                ", producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }


}
