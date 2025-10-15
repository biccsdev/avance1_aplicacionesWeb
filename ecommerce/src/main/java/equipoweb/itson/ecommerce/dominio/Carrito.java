package equipoweb.itson.ecommerce.dominio;

/**
 *
 * @author biccs
 */
import java.time.LocalDateTime;
import java.util.List;

public class Carrito {
    private Integer idCarrito;
    private Usuario usuario; 
    private final LocalDateTime fechaCreacion = LocalDateTime.now();
    private List<ItemCarrito> items;
}
