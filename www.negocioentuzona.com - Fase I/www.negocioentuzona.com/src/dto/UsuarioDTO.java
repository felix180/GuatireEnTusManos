package dto;

import util.Global;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Map;

/**
 * Created by Christian on 18-04-2015.
 */
public class UsuarioDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean logeado;
    private boolean primeraVez;
    private int intentosAcceso;
    private String usuario;
    private String password;
    private String newPassword;
    private String perfilUsuario;
    private String estado;
    private String ipOrigen;
    private Map<Global.rol, Boolean> perfil;
    private Calendar ultimaFechaConexion;
    private EmpresaDTO empresa;
}
