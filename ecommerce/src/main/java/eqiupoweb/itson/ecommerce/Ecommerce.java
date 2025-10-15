/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eqiupoweb.itson.ecommerce;
import equipoweb.itson.ecommerce.dominio.*;
/**
 *
 * @author biccs
 */
public class Ecommerce {
    public static void main(String[] args) {
        Videojuego v1 = new Videojuego(101, "Elden Ring", 59.99);
        Videojuego v2 = new Videojuego(102, "Hades II", 39.99);

        Carrito carrito = new Carrito(1, 1);
        carrito.agregarItem(v1, 1);
        carrito.agregarItem(v2, 2);
        carrito.agregarItem(v1, 1);

        carrito.getItems().forEach(System.out::println);
        System.out.printf("TOTAL: $%.2f%n", carrito.total());
    }
}