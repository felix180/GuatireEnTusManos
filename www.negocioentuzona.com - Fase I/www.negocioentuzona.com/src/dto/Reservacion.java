package dto;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by Christian on 18-04-2015.
 */
public class Reservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    private Cliente cliente;
    private Especialidad especialidad;
    private Calendar fechaAsistencia;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Calendar getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(Calendar fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "cliente=" + cliente +
                ", especialidad=" + especialidad +
                ", fechaAsistencia=" + fechaAsistencia +
                '}';
    }
}
