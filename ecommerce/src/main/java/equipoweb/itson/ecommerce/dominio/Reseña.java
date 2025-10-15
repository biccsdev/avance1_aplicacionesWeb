package equipoweb.itson.ecommerce.dominio;

import java.time.LocalDateTime;

/**
 * Representa una reseña de un videojuego en particular.
 * @author Leonardo Flores Leyva - 252390
 * @author Yuri Germán García López - 252583
 * @author Sebastian Borquez Huerta - 252115
 * @author Ariel Eduardo Borbón Izaguirre - 252116
 */
public class Reseña {
    private Integer idReseña;
    private Cliente cliente;
    private Videojuego videojuego;
    private float calificacion;
    private String comentario;
    private LocalDateTime fechaReseña;
}