package dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by caraque on 17/04/2015.
 */
public class EmpresaDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    private String nombreNegocio;
    private String rif;
    private DireccionDTO direccionDTO;
    private Date horarioAtencion;
    private String descripcion;
    private String email;
    private String numeroTelefonico;

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public DireccionDTO getDireccionDTO() {
        return direccionDTO;
    }

    public void setDireccionDTO(DireccionDTO direccionDTO) {
        this.direccionDTO = direccionDTO;
    }

    public Date getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(Date horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    @Override
    public String toString() {
        return "Negocio{" +
                "nombreNegocio='" + nombreNegocio + '\'' +
                ", rif='" + rif + '\'' +
                ", direccion=" + direccionDTO +
                ", horarioAtencion=" + horarioAtencion +
                ", descripcion='" + descripcion + '\'' +
                ", email='" + email + '\'' +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                '}';
    }
}
