package dto;

/**
 * Created by Christian on 18-04-2015.
 */
public class Especialidad {

    private String codigoEspecialidad;
    private String especialidad;

    public String getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(String codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "codigoEspecialidad='" + codigoEspecialidad + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
