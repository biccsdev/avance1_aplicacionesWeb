package equipoweb.itson.ecommerce.dominio;

/**
 * Relaciona un pedido con los videojuegos comprados.
 * @author Leonardo Flores Leyva - 252390
 * @author Yuri Germán García López - 252583
 * @author Sebastian Borquez Huerta - 252115
 * @author Ariel Eduardo Borbón Izaguirre - 252116
 */
public class DetallePedido {
    private Integer idPedido;
    private Pedido pedido;
    private Videojuego videojuego;
    private int cantidad;
    private float precioUnitario;
    private float importe;
}