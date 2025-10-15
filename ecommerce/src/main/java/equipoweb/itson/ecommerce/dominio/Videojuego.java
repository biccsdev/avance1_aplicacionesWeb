/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoweb.itson.ecommerce.dominio;

/**
 *
 * @author biccs
 */
import java.time.LocalDate;
import java.util.Objects;

public class Videojuego {
    private int idVideojuego;
    private String nombre;
    private String descripcion;
    private double precio;   
    private int existencias;
    private String urlImagen;
    private LocalDate fechaLanzamiento;
    private String plataforma;
    private String desarrollador;

    public Videojuego(int idVideojuego, String nombre, double precio) {
        this.idVideojuego = idVideojuego;
        this.nombre = nombre;
        this.precio = precio;
    }


    public int getIdVideojuego() { return idVideojuego; }
    public void setIdVideojuego(int idVideojuego) { this.idVideojuego = idVideojuego; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getExistencias() { return existencias; }
    public void setExistencias(int existencias) { this.existencias = existencias; }
    public String getUrlImagen() { return urlImagen; }
    public void setUrlImagen(String urlImagen) { this.urlImagen = urlImagen; }
    public LocalDate getFechaLanzamiento() { return fechaLanzamiento; }
    public void setFechaLanzamiento(LocalDate fechaLanzamiento) { this.fechaLanzamiento = fechaLanzamiento; }
    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }
    public String getDesarrollador() { return desarrollador; }
    public void setDesarrollador(String desarrollador) { this.desarrollador = desarrollador; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Videojuego v)) return false;
        return idVideojuego == v.idVideojuego;
    }
    @Override public int hashCode() { return Objects.hash(idVideojuego); }

    @Override public String toString() {
        return nombre + " ($" + precio + ")";
    }
}