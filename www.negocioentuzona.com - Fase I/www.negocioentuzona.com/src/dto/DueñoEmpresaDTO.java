package dto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Christian on 18-04-2015.
 */
public class DueñoEmpresaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private int cedula;
    private DireccionDTO direccionDTO;
    private String correo;
    private ArrayList<TarjeraCreditoDTO> tarjetaCredito;
    private String numeroTelefonico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public DireccionDTO getDireccionDTO() {
        return direccionDTO;
    }

    public void setDireccionDTO(DireccionDTO direccionDTO) {
        this.direccionDTO = direccionDTO;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<TarjeraCreditoDTO> getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(ArrayList<TarjeraCreditoDTO> tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    @Override
    public String toString() {
        return "EncargadoNegocio{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", direccion=" + direccionDTO +
                ", correo='" + correo + '\'' +
                ", tarjetaCredito=" + tarjetaCredito +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                '}';
    }
}
