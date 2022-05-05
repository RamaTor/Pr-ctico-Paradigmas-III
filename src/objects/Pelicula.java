package objects;

public class Pelicula {
    private String nombre;
    private String genero;
    private Double duracion;
    private String director;
    private Integer stock;
    private Integer anioEstreno;
    //agregado
    private Categoria categoria;

    public Pelicula(String nombre, String genero, Double duracion, String director, Integer stock, Integer anioEstreno, Categoria categoria) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
        this.stock = stock;
        this.anioEstreno = anioEstreno;
        this.categoria = categoria;
    }
    public Pelicula() {

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getAnioEstreno() {
        return anioEstreno;
    }
    public void setAnioEstreno(Integer anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", director='" + director + '\'' +
                ", stock=" + stock +
                ", anioEstreno=" + anioEstreno +
                ", categoria=" + categoria +
                '}';
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
