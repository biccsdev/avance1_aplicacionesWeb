package equipoweb.itson.ecommerce.dominio;

import equipoweb.itson.ecommerce.enums.MetodoPago;
import java.time.LocalDateTime;

/**
 * Representa el pago de un pedido.
 * @author Leonardo Flores Leyva - 252390
 * @author Yuri Germán García López - 252583
 * @author Sebastian Borquez Huerta - 252115
 * @author Ariel Eduardo Borbón Izaguirre - 252116
 */
public class Pago {
    private Integer idPago;
    private Pedido pedido;
    private LocalDateTime fechaPago;
    private MetodoPago metodoPago;
    private int monto;
    private EstadoPago estadoPago;
}