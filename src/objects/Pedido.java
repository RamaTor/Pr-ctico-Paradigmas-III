package objects;
import java.util.Date;


public class Pedido {
    private Integer cantidad;
    private Date fecha;
    private String estado;

    public Pedido(Integer cantidad, Date fecha, String estado) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}

