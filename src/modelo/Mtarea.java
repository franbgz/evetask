
package modelo;

/**
 *
 * @author fran
 */
public class Mtarea {
    
    /*
    ATRIBUTOS
    */
    private Integer id;
    private String nombre;

    /*
    CONSTRUCTORES
    */
    public Mtarea() {
    }

    public Mtarea(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /*
    GETTERS & SETTERS
    */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    TOSTRING
    */
    @Override
    public String toString() {
        return this.id + " - " + this.nombre;
    }
    
    
    
}
