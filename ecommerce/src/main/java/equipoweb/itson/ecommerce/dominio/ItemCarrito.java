/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoweb.itson.ecommerce.dominio;

/**
 *
 * @author biccs
 */
import java.util.Objects;

public class ItemCarrito {
    private int idItemCarrito;
    private Videojuego videojuego; 
    private int cantidad;

    public ItemCarrito(int idItemCarrito, Videojuego videojuego, int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("La cantidad debe ser > 0");
        this.idItemCarrito = idItemCarrito;
        this.videojuego = Objects.requireNonNull(videojuego);
        this.cantidad = cantidad;
    }

    public double subtotal() {
        return videojuego.getPrecio() * cantidad;
    }

    public int getIdItemCarrito() { return idItemCarrito; }
    public void setIdItemCarrito(int idItemCarrito) { this.idItemCarrito = idItemCarrito; }
    public Videojuego getVideojuego() { return videojuego; }
    public void setVideojuego(Videojuego videojuego) { this.videojuego = videojuego; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("La cantidad debe ser > 0");
        this.cantidad = cantidad;
    }

    @Override public String toString() {
        return cantidad + " x " + videojuego.toString() + " = $" + subtotal();
    }
}