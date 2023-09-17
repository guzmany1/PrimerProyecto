public class Proveedor {
    private String nombreEmpresa;
    private String contacto;
    private String direccion;
    private String numeroTelefono;

    public Proveedor(String nombreEmpresa, String contacto, String direccion, String numeroTelefono) {
        this.nombreEmpresa = nombreEmpresa;
        this.contacto = contacto;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", contacto='" + contacto + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }

}
