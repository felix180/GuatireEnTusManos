package dto;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by Christian on 18-04-2015.
 */
public class ClienteDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    private String usuario;
    private String contraseña;
    private String nombre;
    private int cedula;
    private Calendar fechaNacimiento;
    private String correoElectronico;
    private DireccionDTO direccionDTO;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

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

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNaciemiento) {
        this.fechaNacimiento = fechaNaciemiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public DireccionDTO getDireccionDTO() {
        return direccionDTO;
    }

    public void setDireccionDTO(DireccionDTO direccionDTO) {
        this.direccionDTO = direccionDTO;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", fechaNaciemiento=" + fechaNacimiento +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", direccion=" + direccionDTO +
                '}';
    }
}
