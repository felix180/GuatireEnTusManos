package dto;

import java.util.Date;

/**
 * Created by caraque on 17/04/2015.
 */
public class TarjeraCredito {

    private double numeroTarjetaCredito;
    private int codigoSeguridad;
    private Date fechaVencimiento;
    private String nombreTirular;

    public double getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(double numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombreTirular() {
        return nombreTirular;
    }

    public void setNombreTirular(String nombreTirular) {
        this.nombreTirular = nombreTirular;
    }

    @Override
    public String toString() {
        return "TarjeraCredito{" +
                "numeroTarjetaCredito=" + numeroTarjetaCredito +
                ", codigoSeguridad=" + codigoSeguridad +
                ", fechaVencimiento=" + fechaVencimiento +
                ", nombreTirular='" + nombreTirular + '\'' +
                '}';
    }
}
