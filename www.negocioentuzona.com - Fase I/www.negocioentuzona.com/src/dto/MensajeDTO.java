package dto;

import java.io.Serializable;

/**
 * Created by Christian on 18-04-2015.
 */
public class MensajeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String descripcion;
    private String tipoMensaje;
    private String codigoMensaje;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    public void setCodigoMensaje(String codigoMensaje) {
        this.codigoMensaje = codigoMensaje;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "descripcion='" + descripcion + '\'' +
                ", tipoMensaje='" + tipoMensaje + '\'' +
                ", codigoMensaje='" + codigoMensaje + '\'' +
                '}';
    }
}
