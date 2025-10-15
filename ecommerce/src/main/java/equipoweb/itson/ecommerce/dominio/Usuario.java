package equipoweb.itson.ecommerce.dominio;

/**
 * Representa a un usuario del sistema.
 * @author Leonardo Flores Leyva - 252390
 * @author Yuri Germán García López - 252583
 * @author Sebastian Borquez Huerta - 252115
 * @author Ariel Eduardo Borbón Izaguirre - 252116
 */
public abstract class Usuario {
    private Integer idUsuario;
    private String nombre;
    private String email;
    private String contrasenia;
    private Direccion direccion;
    private String telefono;
    private boolean isActivo;
}