package videoclub;
import objects.Categoria;
import objects.Pelicula;

public class Main {

    public static void main(String[] args) {

        Pelicula spiderman = new Pelicula();

        Categoria categoria = new Categoria();
        categoria.setNombre("Acción");

        Categoria otraCategoria = new Categoria();
        otraCategoria.setNombre("Ciencia Ficción");

        //set valores
        spiderman.setNombre("lejos de casa");
        spiderman.setAnioEstreno(1994);
        spiderman.setCategoria(categoria);

        System.out.println(spiderman);

        System.out.println("Programa Terminado!!");

    }

}