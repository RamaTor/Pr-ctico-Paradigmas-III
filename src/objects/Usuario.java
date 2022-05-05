package objects;

public class Usuario {
    private Integer idUsuario;
    private String nombre;

    public Usuario(Integer idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
