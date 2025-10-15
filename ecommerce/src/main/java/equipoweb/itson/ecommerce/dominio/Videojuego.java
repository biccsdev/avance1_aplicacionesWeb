package equipoweb.itson.ecommerce.dominio;

/**
 * Representa un videojuegos físico.
 * @author Leonardo Flores Leyva - 252390
 * @author Yuri Germán García López - 252583
 * @author Sebastian Borquez Huerta - 252115
 * @author Ariel Eduardo Borbón Izaguirre - 252116
 */
import java.time.LocalDate;
import java.util.List;

public class Videojuego {
    private Integer idVideojuego;
    private String nombre;
    private String descripcion;
    private float precio;   
    private int existencias;
    private String urlImagen;
    private LocalDate fechaLanzamiento;
    private String plataforma;
    private String desarrollador;
    private List<Reseña> reseñas;
    private List<Categoria> categorias;
}