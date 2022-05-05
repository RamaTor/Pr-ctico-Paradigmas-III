package objects;

public class Socio extends Cliente{
    private Integer idSocio;
    private String nombre;
    private String direccion;


    public Socio(Integer idSocio, String nombre, String direccion) {
        super("Ramiro","Torres",0303456,37993238);
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Integer getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Integer idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
