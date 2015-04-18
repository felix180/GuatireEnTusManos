package dto;

import java.util.ArrayList;

/**
 * Created by Christian on 18-04-2015.
 */
public class Encargado {

    private String nombre;
    private int cedula;
    private Direccion direccion;
    private String correo;
    private ArrayList<TarjeraCredito> tarjetaCredito;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<TarjeraCredito> getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(ArrayList<TarjeraCredito> tarjetaCredito) {
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
                ", direccion=" + direccion +
                ", correo='" + correo + '\'' +
                ", tarjetaCredito=" + tarjetaCredito +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                '}';
    }
}
