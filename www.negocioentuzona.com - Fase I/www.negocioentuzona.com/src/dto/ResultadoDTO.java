package dto;

import java.io.Serializable;

/**
 * Created by Christian on 18-04-2015.
 */
public class ResultadoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object items;
    private boolean success;
    private boolean error;
    private boolean warning;
    private MensajeDTO mensajeDTO;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Object getItems() {
        return items;
    }

    public void setItems(Object items) {
        this.items = items;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean isWarning() {
        return warning;
    }

    public void setWarning(boolean warning) {
        this.warning = warning;
    }

    public MensajeDTO getMensajeDTO() {
        return mensajeDTO;
    }

    public void setMensajeDTO(MensajeDTO mensajeDTO) {
        this.mensajeDTO = mensajeDTO;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "items=" + items +
                ", success=" + success +
                ", error=" + error +
                ", warning=" + warning +
                ", mensaje=" + mensajeDTO +
                '}';
    }
}
