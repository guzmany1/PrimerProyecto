import java.util.Date;

public class Inventario {
    private String tipoMaterial;
    private int existencias;
    private Date fechaSalida;
    private Date fechaIngreso;

    public Inventario(String tipoMaterial, int existencias, Date fechaSalida, Date fechaIngreso) {
        this.tipoMaterial = tipoMaterial;
        this.existencias = existencias;
        this.fechaSalida = fechaSalida;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "tipoMaterial='" + tipoMaterial + '\'' +
                ", existencias=" + existencias +
                ", fechaSalida=" + fechaSalida +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}