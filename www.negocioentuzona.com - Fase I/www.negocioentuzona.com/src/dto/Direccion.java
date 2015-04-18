package dto;

/**
 * Created by caraque on 17/04/2015.
 */
public class Direccion {

    private String pais;
    private String estado;
    private String municipio;
    private String ciudad;
    private String codigoPostal;
    private String coordenadas;
    private int piso;
    private String local;
    private String centroComercial;
    private String calle;
    private String Avenida;
    private String lugarReferencia;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAvenida() {
        return Avenida;
    }

    public void setAvenida(String avenida) {
        Avenida = avenida;
    }

    public String getLugarReferencia() {
        return lugarReferencia;
    }

    public void setLugarReferencia(String lugarReferencia) {
        this.lugarReferencia = lugarReferencia;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                ", municipio='" + municipio + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", coordenadas='" + coordenadas + '\'' +
                ", piso=" + piso +
                ", local='" + local + '\'' +
                ", centroComercial='" + centroComercial + '\'' +
                ", calle='" + calle + '\'' +
                ", Avenida='" + Avenida + '\'' +
                ", lugarReferencia='" + lugarReferencia + '\'' +
                '}';
    }
}