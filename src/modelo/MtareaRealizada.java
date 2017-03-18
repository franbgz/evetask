package modelo;

import java.time.LocalDate;

/**
 *
 * @author fran
 */
public class MtareaRealizada extends Mtarea {

    /*
    ATRIBUTOS
     */
    private LocalDate fecha;
    private Integer hora, minuto;

    /*
    CONSTRUCTORES
     */
    public MtareaRealizada() {
    }

    public MtareaRealizada(LocalDate fecha, Integer hora, Integer minuto, Integer id, String nombre) {
        super(id, nombre);
        this.fecha = fecha;
        this.hora = hora;
        this.minuto = minuto;
    }

    /*
    GETTERS & SETTERS
     */
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    /*
    TOSTRING()
    */
    @Override
    public String toString() {
        return super.toString() + " (" + this.fecha.getDayOfMonth() + "/" 
                + this.fecha.getMonthValue() + "/" + this.fecha.getYear() 
                + ") - " + this.getHora() + ":" + this.getMinuto();
    }
    

}
