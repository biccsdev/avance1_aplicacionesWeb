/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoweb.itson.ecommerce.dominio;

/**
 *
 * @author biccs
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private int idCarrito;
    private int idUsuario; 
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private final List<ItemCarrito> items = new ArrayList<>();

    public Carrito(int idCarrito, int idUsuario) {
        this.idCarrito = idCarrito;
        this.idUsuario = idUsuario;
    }

    public void agregarItem(Videojuego v, int cantidad) {
        for (ItemCarrito it : items) {
            if (it.getVideojuego().equals(v)) {
                it.setCantidad(it.getCantidad() + cantidad);
                return;
            }
        }
        items.add(new ItemCarrito(generarIdItem(), v, cantidad));
    }

    public void quitarPorIdVideojuego(int idVideojuego) {
        items.removeIf(it -> it.getVideojuego().getIdVideojuego() == idVideojuego);
    }

    public double total() {
        return items.stream().mapToDouble(ItemCarrito::subtotal).sum();
    }

    public void vaciar() { items.clear(); }

    private int generarIdItem() {
        return items.size() + 1; 
    }

    public int getIdCarrito() { return idCarrito; }
    public int getIdUsuario() { return idUsuario; }
    public LocalDateTime getFechaCreacion() { return fechaCreacion; }
    public List<ItemCarrito> getItems() { return List.copyOf(items); }
}
