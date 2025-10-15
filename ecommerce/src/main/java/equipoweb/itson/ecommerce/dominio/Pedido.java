package equipoweb.itson.ecommerce.dominio;

import equipoweb.itson.ecommerce.enums.EstadoPedido;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Representa un pedido.
 * @author Leonardo Flores Leyva - 252390
 * @author Yuri Germán García López - 252583
 * @author Sebastian Borquez Huerta - 252115
 * @author Ariel Eduardo Borbón Izaguirre - 252116
 */
public class Pedido {
    private Integer idPedido;
    private Cliente cliente;
    private LocalDateTime fechaPedido;
    private Direccion direccionEnvio;
    private float totalPagado;
    private EstadoPedido estadoPedido;
    private List<DetallePedido> detallesPedido;
}