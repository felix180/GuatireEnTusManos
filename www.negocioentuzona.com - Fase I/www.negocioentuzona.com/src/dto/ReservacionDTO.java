package dto;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by Christian on 18-04-2015.
 */
public class ReservacionDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private ClienteDTO clienteDTO;
    private EspecialidadDTO especialidadDTO;
    private Calendar fechaAsistencia;

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public EspecialidadDTO getEspecialidadDTO() {
        return especialidadDTO;
    }

    public void setEspecialidadDTO(EspecialidadDTO especialidadDTO) {
        this.especialidadDTO = especialidadDTO;
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
                "cliente=" + clienteDTO +
                ", especialidad=" + especialidadDTO +
                ", fechaAsistencia=" + fechaAsistencia +
                '}';
    }
}
