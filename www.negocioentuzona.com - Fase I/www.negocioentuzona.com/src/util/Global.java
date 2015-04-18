package util;

/**
 * Created by Christian on 18-04-2015.
 */

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class Global {
    public static final int LIMITE_CANTIDAD_INTENTOS_LOGIN = 3;
    public static final int LIMITE_TIEMPO_HTTP_CLIENT = 10000;
    public static final int NHILOS = 10;
    public static final int NroFilasxCasos = 9;
    public static final int NUMERO_MAXIMO_CASOS_DETAIL = 500;
    public static final int NUMERO_MAXIMO_CONEXIONESL = 20;
    public static final int REINICIO_ITENTOS_LOGIN = 0;
    public static final String ADMINUSERNAMEVALUE = "REMPORTAL";
    public static final String ADMINPASSWORDVALUE = "PortalRem01++";
    public static final String CARACTER_A_REEMPLAZAR = "%";
    public static final String CIERRE = "C";
    public static final String COD_INSTALADOR_NO_EXISTE = "138";
    public static final String COD_INSTALADOR_NO_CONSISTENTE = "151";
    public static final String COD_INSTALADOR_NO_TIENE_DATOS = "152";
    public static final String COD_ERROR_INTERNO_OSB = "9999";
    public static final String COD_NO_EXSISTE = "302";
    public static final String COD_WARNING_SERIALIZABLE = "310";
    public static final String COD_DESACTIVADO = "03";
    public static final String COD_ERROR_AUTENTICACION = "623";
    public static final String COD_ERROR_AUTENTICACION_NPE = "java.lang.NullPointerException";
    public static final String COD_RESP_EXITOSA = "111";
    public static final String COD_ERROR_INTERNO = "-1";
    public static final String COD_ERROR_POST = "-2";
    public static final String COD_ESTADO_CUENTA_CLIENTE_ACTIVA = "367";
    public static final String COD_ESTADO_CUENTA_CLIENTE_INCATIVA = "368";
    public static final String CONS_DEVOLUCION = "D";
    public static final String CONS_CANCELACION = "C";
    public static final String CONS_RUTA_PDF_JASPER = "reportePDF.jasper";
    public static final String CONS_CONTENT_TYPE_PDF = "application/pdf";
    public static final String CONS_CONTENT_TYPE_XLSX = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    public static final String CUENTA_CLIENTE_PREACTIVA = "PS";
    public static final String CUENTA_CLIENTE_ANULADA = "EA";
    public static final String DAÑADO = "D";
    public static final String DECO = "DECO";
    public static final String DECO_MIN = "S";
    public static final String DEVOLUCION = "D";
    public static final String ELEMENTO_GARANTIA = "GARANTIA";
    public static final String EN_ASIGNACION = "En Asignación";
    public static final String ERROR_POST = "The host did not accept the connection within timeout of";
    public static final String ESTADO_CUENTA_CLIENTE_ACTIVA = "A";
    public static final String ESTADO_ACTIVO = "Activo";
    public static final String ESTADO_INACTIVO = "Inactivo";
    public static final String ESTADO_POR_APROBAR = "Por Aprobar";
    public static final String ESTADO_NO_APLICA = "No aplica";
    public static final String ESTADO_ELIMINADO = "Eliminar";
    public static final String ESTADO_CATEGORIA_ACTIVA = "Activa";
    public static final String ESTADO_USUARIO_ACTUAL = "Actual";
    public static final String ESTADO_USUARIO_DESACTIVADO = "Desactivado";
    public static final String ESTADO_REMEDY_SERIAL_VALIDO = "102";
    public static final String FECHA_CRITERIO_CITA = "CITA";
    public static final String FECHA_CRITERIO_ASIGNACION = "ASIGNACIÓN";
    public static final String FECHA_CRITERIO_SOLUCION = "SOLUCIÓN";
    public static final String FECHA_CRITERIO_SALIDA_PLANIFICADA = "SALIDA PLANIFICADA";
    public static final String FORMATO_FECHA_QUALIFICATION_REMEDY = "dd/MM/yyyy";
    public static final String GAMA_COMERCIAL_ANTENA = "ANTENA";
    public static final String GUION = "-";
    public static final String IDIOMA = "es";
    public static final String MSJ_CONFIRMAR_SUMAR_CONTACTO = "¿Está usted seguro de que desea sumar un contacto?.";
    public static final String MSJ_DESCRIPCION_ESTADO_SERIALES_ESPERA = "Seriales en proceso de verificación, por favor espere un momento e inténtelo de nuevo.";
    public static final String MSJ_EMPRESA_NO_SELECCIONADA = "Debe seleccionar una empresa.";
    public static final String MSJ_ERROR_AUTENTICACION_INTENTO = "Contraseña ingresada es incorrecta, al intento nro. % su usuario sera bloqueado.";
    public static final String MSJ_ERROR_AUTENTICACION_OTP_INTENTO = "La contraseña OTP es incorrecta, al intento nro. % su usuario sera bloqueado.";
    public static final String MSJ_ERROR_CONEXION = "El servicio de detalle de decodificadores no response, se intento encolar y aun no funciona se cancela la operación.";
    public static final String MSJ_ERROR_CAMPO_COMENTARIO_REQUERIDO = "El Comentario es requerido.";
    public static final String MSJ_ERROR_CAMPO_RADIO_SELECCION_REQUERIDO = "Seleccione una de las opciones.";
    public static final String MSJ_ERROR_EMAIL_INVALIDO = "El email ingresado no es válido.";
    public static final String MSJ_ERROR_INTERNO = "Ha ocurrido un error interno, por favor contacte al administrador.";
    public static final String MSJ_ERROR_MAXIMO_MINIMO_VIOLADO = "La cantidad total del material % no cumple con el mínimo o máximo configurado.";
    public static final String MSJ_ERROR_MINIMO_ANTENA = "Debe agregar al menos una antena.";
    public static final String MSJ_ERROR_VALIDACION_NUEVA_CLAVE = "La contraseña nueva debe ser diferente a la clave actual.";
    public static final String MSJ_ERROR_VALIDACION_NUEVA_CLAVE_INSEGURA = "La contraseña ingresada no cumple con todas las condiciones de seguridad.";
    public static final String MSJ_ERROR_VALIDACION_NUEVA_CLAVE_CONFIRMACION = "La contraseña nueva y su confirmación deben ser iguales.";
    public static final String MSJ_ERROR_VENCIMIENTO_OTP = "Su contraseña OTP ha caducado, por favor intentelo nuevamente.";
    public static final String MSJ_ERROR_VENCIMIENTO_SESION = "Su sesión ha caducado, Por favor inicie sesión nuevamente.";
    public static final String MSJ_FUERA_SLA = "Está registrando una cita fuera del SLA que tiene establecido.";
    public static final String MSJ_INC_NO_APLICA = "No se encontró un caso que coincida con el número ingresado o esté disponible para registrar materiales.";
    public static final String MSJ_NO_ROWS_HISTORICO = "No se encontraron Comentarios.";
    public static final String MSJ_NO_ROWS_CITAS = "No se encontraron citas.";
    public static final String MSJ_NO_ROWS_CASOS = "No se encontraron registros con el criterio seleccionado.";
    public static final String MSJ_NO_ROWS_DECOS = "No se encontraron registros con el criterio seleccionado.";
    public static final String MSJ_NO_ROWS = "No se encontraron datos.";
    public static final String MSJ_NO_SELECTED_PDF = "Debe seleccionar al menos un caso para generar el reporte de servicio.";
    public static final String MSJ_NO_SELECTED_XLS = "Debe seleccionar al menos un caso para generar el reporte detallado.";
    public static final String MSJ_NO_HAY_MATERIALES_A_REGISTRAR = "Debe agregar al menos un material para realizar el registro.";
    public static final String MSJ_NO_EXISTE = "Login de usuario o contraseña son incorrectos.";
    public static final String MSJ_NO_EXISTE_RECETA = "No existe una receta configurada, debe contactar a la gerencia técnica de TV.";
    public static final String MSJ_RESP_EXITOSA = "Se ha realizado la operación exitosamente.";
    public static final String MSJ_TOTAL_GAMA = "Total Gama ";
    public static final String MSJ_TOTAL_MODELO = "Total Modelo ";
    public static final String MSJ_TECNICO_ESTA_EN_LISTA_NEGRA = "El técnico está en lista negra, comuníquese con el supervisor de movistar.";
    public static final String MSJ_TECNICO_EXISTE = "El técnico ingresado ya existe en el sistema.";
    public static final String MSJ_WARNING_NO_FOUND = "La opcion seleccionada no se encuentra.";
    public static final String MSJ_WARNING_SERIALIZABLE_1 = "El procesamiento de algunos seriales ha fallado, por favor intente procesarlos nuevamente.";
    public static final String MSJ_WARNING_SERIALIZABLE_2 = "Existe un error de comunicación en el procesamiento de los seriales, por favor contacte a la gerencia técnica de TV.";
    public static final String NAME_REPORT_PDF = ("\"Reporte Servicio_" + Calendar.getInstance().getTime().toString() + ".PDF\"").replace(":", "-");
    public static final String NAME_REPORT_XLS = ("\"Reporte Detallado_" + Calendar.getInstance().getTime().toString() + ".XLSX\"").replace(":", "-");
    public static final String NO = "NO";
    public static final String NO_REMEDY = "No";
    public static final String NUEVO = "N";
    public static final String NOAPLICA = "NO APLICA";
    public static final String OP_CATEGORIA_INS = "INSTALACION";
    public static final String OP_CATEGORIA_SERVICE = "SERVICIO TECNICO";
    public static final String OP_ESTADO_ENPROCESO = "EN PROCESO";
    public static final String OP_ESTADO_CERRADO = "CERRADO";
    public static final String OP_SUBESTADO_ASIGNACION_AUTOMATICA = "ASIGNACIÓN AUTOMÁTICA";
    public static final String OP_SUBESTADO_ASIGNADO_POR_SUPERVISOR = "ASIGNADO POR SUPERVISOR";
    public static final String OP_SUBESTADO_PENDIENTE_POR_VISITA = "PENDIENTE POR VISITA";
    public static final String OP_SUBESTADO_INST_REPAR = "CLIENTE INSTALADO / REPARADO";
    public static final String PROTOCOLO = "http://";
    public static final String PUERTO = ":" + obtenerPropiedad("PUERTO_APP");
    public static final String PUERTO_OSB = ":" + obtenerPropiedad("PUERTO_OSB");
    public static final String PAIS = "VE";
    public static final String SEPARADOR = "/";
    public static final String SEPARADOR_PUNTO_COMA = ";";
    public static final String SEPARADOR_COMA = ",";
    public static final String SI = "SI";
    public static final String SI_REMEDY = "Si";
    public static final String SUFIJO_REDIRECCION = "?faces-redirect=true";
    public static final String SESSION_MAP_KEY_CASO_SELECCIONADO = "casoSeleccionado";
    public static final String SESSION_MAP_KEY_LISTA_CASOS = "listaCasos";
    public static final String SESSION_MAP_KEY_EMPRESA_SELECCIONADA = "empSelected";
    public static final String SESSION_MAP_KEY_NUEVO_TECNICO = "nuevoTecnico";
    public static final String SESSION_MAP_KEY_TECNICO_A_MODIFICAR = "tecnicoAModificar";
    public static final String TIPO_COMENTARIO_NOTA_RECLAMO = "Nota de Reclamo";
    public static final String TOKEN_SESSION = "sessionBean";
    public static final String TOKEN_SESSION_ID = "wrlSesionUrl";
    public static final String TURNO_TARDE = "TARDE";
    public static final String TURNO_MEDIODIA = "MEDIODIA";
    public static final String TURNO_MAÑANA = "MAÑANA";
    public static final String TODOS = "TODOS";
    public static final String TODAS = "TODAS";
    public static final String TARJETA = "TARJETA";
    public static final String TARJETA_MIN = "T";
    public static final String TEXTO_PROCESAR_SERIALES = "Procesar";
    public static final String TEXTO_VERIFICAR_SERIALES = "Verificar";
    public static final String URL_ICO_ALERTA_CHECK = "resources/images/ico_check.png";
    public static final String URL_ICO_ALERTA_WARNING = "resources/images/ico_warning.png";
    public static final String URL_ICO_ALERTA_ERROR = "resources/images/ico_x.png";
    public static final String URL_ICO_ALERTA_WAIT = "resources/images/ico_clock.png";
    public static final String URL_ICO_NOTA = "resources/images/ico_nota.png";
    public static final String VERDADERO = "SI";
    public static final String ZONA_HORARIA = "America/Caracas";

    private static Map<String, Object> paramPDF;
    private static Map<modificadorPagina, Object> modificadoresPagina;

    public static enum digito {
        CERO, UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE
    }

    public static enum modificadorPagina {
        FORMATO_FECHA, FORMATO_FECHA_DIA, FORMATO_FECHA_REMEDY
    }


    public static Map<modificadorPagina, Object> getModificadoresPagina() {
        if (modificadoresPagina == null)
            setModificadoresPagina();
        return modificadoresPagina;
    }

    public static void setModificadoresPagina() {
        modificadoresPagina = new HashMap<modificadorPagina, Object>();
        modificadoresPagina.put(modificadorPagina.FORMATO_FECHA, "dd/MM/yyyy h:mm a");
        modificadoresPagina.put(modificadorPagina.FORMATO_FECHA_REMEDY, "yyyy-MM-dd");
        modificadoresPagina.put(modificadorPagina.FORMATO_FECHA_DIA, "EEEE");
    }

    public static Map<String, Object> getParamPDF() {
        if (paramPDF == null)
            setParamPDF();
        return paramPDF;
    }

    public static void setParamPDF() {
        paramPDF = new HashMap<String, Object>();
        paramPDF.put("P_TITULO", "ORDEN DE SERVICIO / PRUEBA Y ACEPTACIÓN DEL SERVICIO");
        paramPDF.put("P_ID_INCIDENCIA", "N° Orden de servicio (INC):");
        paramPDF.put("P_FECHA_INSTALACION", "Fecha de Instalación:");
        paramPDF.put("P_SUB_SUBSCRIP", "D a t o s   d e l   S u s c r i p t o r ");
        paramPDF.put("P_FIELD_APELLNOMBRE", "Apellidos y Nombres: ");
        paramPDF.put("P_FIELD_CEDULA", "C.I: ");
        paramPDF.put("P_FIELD_CUENTA", "N° Cuenta Cliente");
        paramPDF.put("P_FIELD_TELF_CLIENT", "Teléfonos contacto visita:");
        paramPDF.put("P_FIELD_REGION", "Region de Visita:");
        paramPDF.put("P_FIELD_ESTADO", "Estado:");
        paramPDF.put("P_FIELD_CIUDAD", "Ciudad:");
        paramPDF.put("P_FIELD_MUNICIPIO", "Municipio:");
        paramPDF.put("P_FIELD_SECTOR", "Sector:");
        paramPDF.put("P_FIELD_TIPO_VIA", "Tipo de Via:");
        paramPDF.put("P_FIELD_TIPO_EDIFCACION", "Tipo Edificación:");
        paramPDF.put("P_FIELD_TIPO_LUGAR", "Tipo Lugar:");
        paramPDF.put("P_FIELD_DIRECCION", "Dirección:");
        paramPDF.put("P_FIELD_PTO_REF", "Punto de Referencia:");
        paramPDF.put("P_SUB_INCIDENTE", "D a t o s  d e l  I n c i d e n t e");
        paramPDF.put("P_FIELD_CATEGORIA", "Categoria:");
        paramPDF.put("P_FIELD_TIPO", "Tipo:");
        paramPDF.put("P_FIELD_FECHA_ASIG", "Fecha de Asignacion:");
        paramPDF.put("P_FIELD_ESTADO_INC", "Estado Incidente:");
        paramPDF.put("P_FIELD_SUB_ESTADO_INC", "Sub Estado:");
        paramPDF.put("P_FIELD_DETALLE", "Detalle:");
        paramPDF.put("P_FALLA", "Falla:");
        paramPDF.put("P_SUB_INSTAL", "D a t o s   d e   l a   I n s t a l a c i ó n  ");
        paramPDF.put("P_SUB_MATERIAL", "Materiales Utilizados o Reemplazados");
        paramPDF.put("P_FIELD_CABLE", "Cable Coaxial:");
        paramPDF.put("P_FIELD_DECO", "Deco:");
        paramPDF.put("P_FIELD_SPLITTER", "Splitters:");
        paramPDF.put("P_FIELD_CARGAS", "Cargas:");
        paramPDF.put("P_FIELD_ANTENA", "Antena:");
        paramPDF.put("P_FIELD_SMARTCARD", "SmartCard:");
        paramPDF.put("P_FIELD_LNB", "LNB:");
        paramPDF.put("P_FIELD_CONECTORES", "Conectores:");
        paramPDF.put("P_SUB_PARAM_CALIDAD", "M e d i c i o n e s   d e   p a r a m e t r o s   d e   c a l i d a d   S T B");
        paramPDF.put("P_SUB_EQUIPOS_USED", "Equipos Utilizados");
        paramPDF.put("P_FIELD_STB_MODEL", "STB (Modelo)");
        paramPDF.put("P_FIELD_CAS_ID", "CAS ID");
        paramPDF.put("P_FIELD_SMART_CARD", "Smart Card (Serial)");
        paramPDF.put("P_FIELD_PPA_ADD", "Ppal/Adic.");
        paramPDF.put("P_FIELD_ESTATUS", "Estatus");
        paramPDF.put("P_SUB_OBSERVACIONES", "O b s e r v a c i o n e s");
        paramPDF.put("P_SUB_FIRMAS", "F i r m a s");
    }


    //	---------------------------------------------------------------------------------------------------------------------------
//	---------------------------------------------------------------------------------------------------------------------------
//	--------------------------------------------------REMEDY WEB LIGHT PROPERTYS-----------------------------------------------
//	--------------------------------------------------(valores parametrizables)------------------------------------------------
//  ---------------------------------------------------------------------------------------------------------------------------
    private static Map<propiedad, Object> propiedades;

    public static enum propiedad {
        NRO_REGISTROS_DATATABLE, VIGENCIA_SESION, VIGENCIA_OTP, INTENTOS_OTP, INTENTOS_CLAVE, MENSAJE_OLVIDO_DE_USUARIO,
        MINIMO_CARACTERES_CLAVE, MAXIMO_CARACTERES_CLAVE, MINIMO_LETRAS_CLAVE, MINIMO_NUMEROS_CLAVE, NRO_REGISTROS_DATATABLE_POPUP, NRO_REGISTROS_SERIALES, NRO_CARACTERES_SERIALES, MAXIMO_NOTAS_INCONFORMIDAD
    }

    public static String obtenerPropiedad(String idPropiedad) {
        ResourceBundle resource = ResourceBundle.getBundle("remedyWebLight");
        return resource.getString(idPropiedad);
    }

    public static Map<propiedad, Object> getPropiedades() {
        if (propiedades == null)
            setPropiedades();
        return propiedades;
    }

    public static void setPropiedades() {
        propiedades = new HashMap<propiedad, Object>();
        propiedades.put(propiedad.INTENTOS_CLAVE, obtenerPropiedad("INTENTOS_CLAVE"));
        propiedades.put(propiedad.INTENTOS_OTP, obtenerPropiedad("INTENTOS_OTP"));
        propiedades.put(propiedad.MENSAJE_OLVIDO_DE_USUARIO, obtenerPropiedad("MENSAJE_OLVIDO_DE_USUARIO"));
        propiedades.put(propiedad.NRO_REGISTROS_DATATABLE, Integer.parseInt(obtenerPropiedad("NRO_REGISTROS_DATATABLE")));
        propiedades.put(propiedad.NRO_REGISTROS_DATATABLE_POPUP, Integer.parseInt(obtenerPropiedad("NRO_REGISTROS_DATATABLE_POPUP")));
        propiedades.put(propiedad.VIGENCIA_OTP, Integer.parseInt(obtenerPropiedad("VIGENCIA_OTP")));
        propiedades.put(propiedad.VIGENCIA_SESION, Integer.parseInt(obtenerPropiedad("VIGENCIA_SESION")));
        propiedades.put(propiedad.MINIMO_CARACTERES_CLAVE, obtenerPropiedad("MINIMO_CARACTERES_CLAVE"));
        propiedades.put(propiedad.MAXIMO_CARACTERES_CLAVE, obtenerPropiedad("MAXIMO_CARACTERES_CLAVE"));
        propiedades.put(propiedad.MINIMO_LETRAS_CLAVE, obtenerPropiedad("MINIMO_LETRAS_CLAVE"));
        propiedades.put(propiedad.MINIMO_NUMEROS_CLAVE, obtenerPropiedad("MINIMO_NUMEROS_CLAVE"));
        propiedades.put(propiedad.NRO_REGISTROS_SERIALES, Integer.parseInt(obtenerPropiedad("NRO_REGISTROS_SERIALES")));
        propiedades.put(propiedad.NRO_CARACTERES_SERIALES, Integer.parseInt(obtenerPropiedad("NRO_CARACTERES_SERIALES")));
        propiedades.put(propiedad.MAXIMO_NOTAS_INCONFORMIDAD, Integer.parseInt(obtenerPropiedad("MAXIMO_NOTAS_INCONFORMIDAD")));
    }

//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------REMEDY WEB LIGHT CONFIGURATIONS------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------

    private static Map<rol, Boolean> perfil;
    private static Map<pagina, String> paginas;
    private static Map<tituloPopup, String> tituloPopups;
    private static Map<rol, String> rolFromRemedy;
    private static Map<String, rol> opcionRol;

    public static enum rol {
        CONSULTA_CASO, AGENDAMIENTO_CITA, HOJA_SERVICIO, CIERRE_DEVOLUCION, RETIPIFICAR_CASO, ACTUALIZAR_DIRECCION, REGISTRO_MATERIAL,
        CONSULTA_INVENTARIO, INFO_DECO, SUMAR_CONTACTO, CAMBIO_CLAVE, PRINCIPAL, DETALLE_CASO, SELECCIONAR_EMPRESA, INVENTARIO_LIQUIDADO,
        DESPACHOS_MATERIAL, ADMINISTRACION_TECNICOS, ADMINISTRACION_LISTA_NEGRA
    }

    public static enum pagina {
        INDEX, VACIA, LOGIN, CAMBIOCLAVE, PRINCIPAL, DETALLECASO, ACTUALIZACION_DIRECCION, AGENDAMIENTO, CIERREDEVOLUCION, RETIPIFICAR,
        CONSULTACASO, REGISTRO_MATERIAL, INVENTARIO_CONSIGNADO, INFO_DECO, FINSESION, VALIDAR_SERIALES, INVENTARIO_LIQUIDADO, DESPACHOS_MATERIAL,
        ADMINISTRACION_TECNICOS, ADMINISTRACION_LISTA_NEGRA, INGRESAR_TECNICO, MODIFICAR_TECNICO, HISTORICO_COMENTARIOS
    }

    public static enum tituloPopup {
        INDEX, VACIA, LOGIN, CAMBIOCLAVE, DETALLECASO, ACTUALIZACION_DIRECCION, AGENDAMIENTO, CIERREDEVOLUCION, RETIPIFICAR,
        REGISTRAR_MATERIAL, HISTCITAS, HISTCOMENTARIOS, SUMARCONTACTO, GENERAL, CONSULTACASO, HOJA_SERVICIO_PDF,
        RETIPIFICACION, AGENDAMIENTOCITAS, INVENTARIO_CONSIGNADO, VALIDAR_SERIALES, INVENTARIO_LIQUIDADO, DESPACHOS_MATERIAL,
        ADMINISTRACION_TECNICOS, ADMINISTRACION_LISTA_NEGRA, INGRESAR_TECNICO, MODIFICAR_TECNICO
    }

    public static Map<rol, Boolean> getPerfil() {
        setPerfil();
        return perfil;
    }

    public static void setPerfil() {
        perfil = new HashMap<rol, Boolean>();
        perfil.put(rol.CONSULTA_CASO, false);
        perfil.put(rol.AGENDAMIENTO_CITA, false);
        perfil.put(rol.HOJA_SERVICIO, false);
        perfil.put(rol.CIERRE_DEVOLUCION, false);
        perfil.put(rol.RETIPIFICAR_CASO, false);
        perfil.put(rol.ACTUALIZAR_DIRECCION, false);
        perfil.put(rol.REGISTRO_MATERIAL, false);
        perfil.put(rol.CONSULTA_INVENTARIO, false);
        perfil.put(rol.INFO_DECO, true);
        perfil.put(rol.SUMAR_CONTACTO, true);
        perfil.put(rol.CAMBIO_CLAVE, false);
        perfil.put(rol.PRINCIPAL, true);
        perfil.put(rol.DETALLE_CASO, true);
        perfil.put(rol.SELECCIONAR_EMPRESA, false);
        perfil.put(rol.INVENTARIO_LIQUIDADO, false);
        perfil.put(rol.DESPACHOS_MATERIAL, false);
        perfil.put(rol.ADMINISTRACION_TECNICOS, false);
        perfil.put(rol.ADMINISTRACION_LISTA_NEGRA, false);
    }


    public static Map<pagina, String> getPaginas() {
        if (paginas == null)
            setPaginas();
        return paginas;
    }

    private static void setPaginas() {
        paginas = new HashMap<pagina, String>();
        paginas.put(pagina.VACIA, "");
        paginas.put(pagina.INDEX, "index.xhtml");
        paginas.put(pagina.LOGIN, "index.xhtml");
        paginas.put(pagina.CAMBIOCLAVE, "password.xhtml");
        paginas.put(pagina.PRINCIPAL, "inicio.xhtml");
        paginas.put(pagina.CONSULTACASO, "consulta.xhtml");
        paginas.put(pagina.DETALLECASO, "detalles.xhtml");
        paginas.put(pagina.ACTUALIZACION_DIRECCION, "actualizar.xhtml");
        paginas.put(pagina.AGENDAMIENTO, "agendamiento.xhtml");
        paginas.put(pagina.CIERREDEVOLUCION, "devolucionCierre.xhtml");
        paginas.put(pagina.RETIPIFICAR, "reTipificar.xhtml");
        paginas.put(pagina.REGISTRO_MATERIAL, "registroMateriales.xhtml");
        paginas.put(pagina.INVENTARIO_CONSIGNADO, "inventario.xhtml");
        paginas.put(pagina.INFO_DECO, "decoSmartcards.xhtml");
        paginas.put(pagina.FINSESION, "finSesion.xhtml");
        paginas.put(pagina.VALIDAR_SERIALES, "decoSmartcards.xhtml");
        paginas.put(pagina.INVENTARIO_LIQUIDADO, "inventarioLiquidado.xhtml");
        paginas.put(pagina.DESPACHOS_MATERIAL, "despachosDeMaterial.xhtml");
        paginas.put(pagina.ADMINISTRACION_TECNICOS, "administracionTecnicos.xhtml");
        paginas.put(pagina.ADMINISTRACION_LISTA_NEGRA, "administrarListaNegra.xhtml");
        paginas.put(pagina.INGRESAR_TECNICO, "nuevoTecnico.xhtml");
        paginas.put(pagina.MODIFICAR_TECNICO, "modificarEliminarTecnico.xhtml");
        paginas.put(pagina.HISTORICO_COMENTARIOS, "historicoComentarios.xhtml");

    }

    public static Map<tituloPopup, String> getTituloPopups() {
        if (tituloPopups == null)
            setTituloPopups();
        return tituloPopups;
    }

    private static void setTituloPopups() {
        tituloPopups = new HashMap<tituloPopup, String>();
        tituloPopups.put(tituloPopup.VACIA, "");
        tituloPopups.put(tituloPopup.LOGIN, "Login");
        tituloPopups.put(tituloPopup.CAMBIOCLAVE, "Cambio de contraseña");
        tituloPopups.put(tituloPopup.CONSULTACASO, "Consulta de casos");
        tituloPopups.put(tituloPopup.DETALLECASO, "Detalle de casos");
        tituloPopups.put(tituloPopup.ACTUALIZACION_DIRECCION, "Actualizar dirección de caso");
        tituloPopups.put(tituloPopup.AGENDAMIENTO, "Agendamiento de citas");
        tituloPopups.put(tituloPopup.CIERREDEVOLUCION, "Devolución/Cierre de casos");
        tituloPopups.put(tituloPopup.RETIPIFICAR, "Re-tipificación de casos");
        tituloPopups.put(tituloPopup.HISTCITAS, "Historico de citas");
        tituloPopups.put(tituloPopup.HISTCOMENTARIOS, "Historico de comentarios");
        tituloPopups.put(tituloPopup.SUMARCONTACTO, "Sumar contactos");
        tituloPopups.put(tituloPopup.GENERAL, "Remedy Web Light");
        tituloPopups.put(tituloPopup.HOJA_SERVICIO_PDF, "Generación de reporte de servicio.");
        tituloPopups.put(tituloPopup.RETIPIFICACION, "Retipificación de Casos.");
        tituloPopups.put(tituloPopup.AGENDAMIENTOCITAS, "Agendamiento de Citas.");
        tituloPopups.put(tituloPopup.INVENTARIO_CONSIGNADO, "Inventario Consignado");
        tituloPopups.put(tituloPopup.VALIDAR_SERIALES, "Información de Decos y/o Tarjetas Reemplazados y Dañados.");
        tituloPopups.put(tituloPopup.INVENTARIO_LIQUIDADO, "Inventario Liquidado");
        tituloPopups.put(tituloPopup.DESPACHOS_MATERIAL, "Despachos de material consignado");
        tituloPopups.put(tituloPopup.ADMINISTRACION_TECNICOS, "Administración de técnicos de la EECC");
        tituloPopups.put(tituloPopup.ADMINISTRACION_LISTA_NEGRA, "Administración de Lista Negra de Técnicos");
        tituloPopups.put(tituloPopup.INGRESAR_TECNICO, "Ingresar Técnico");
        tituloPopups.put(tituloPopup.MODIFICAR_TECNICO, "Modificar Técnico");
    }

    public static Map<rol, String> getRolFromRemedy() {
        if (rolFromRemedy == null)
            setRolFromRemedy();
        return rolFromRemedy;
    }

    public static void setRolFromRemedy() {
        rolFromRemedy = new HashMap<rol, String>();
        rolFromRemedy.put(rol.CONSULTA_CASO, "A");
        rolFromRemedy.put(rol.AGENDAMIENTO_CITA, "B");
        rolFromRemedy.put(rol.HOJA_SERVICIO, "C");
        rolFromRemedy.put(rol.CIERRE_DEVOLUCION, "D");
        rolFromRemedy.put(rol.RETIPIFICAR_CASO, "E");
        rolFromRemedy.put(rol.ACTUALIZAR_DIRECCION, "F");
        rolFromRemedy.put(rol.REGISTRO_MATERIAL, "G");
        rolFromRemedy.put(rol.CONSULTA_INVENTARIO, "H");
        rolFromRemedy.put(rol.CAMBIO_CLAVE, "I");
        rolFromRemedy.put(rol.ADMINISTRACION_TECNICOS, "J");
        rolFromRemedy.put(rol.ADMINISTRACION_LISTA_NEGRA, "K");
        rolFromRemedy.put(rol.SELECCIONAR_EMPRESA, "L");
        rolFromRemedy.put(rol.INVENTARIO_LIQUIDADO, "M");
        rolFromRemedy.put(rol.DESPACHOS_MATERIAL, "N");
    }

    public static Map<String, rol> getOpcionRol() {
        if (opcionRol == null)
            setOpcionRol();
        return opcionRol;
    }

    public static void setOpcionRol() {
        opcionRol = new HashMap<String, rol>();
        opcionRol.put(paginas.get(pagina.CONSULTACASO), rol.CONSULTA_CASO);
        opcionRol.put(paginas.get(pagina.AGENDAMIENTO), rol.AGENDAMIENTO_CITA);
        opcionRol.put(paginas.get(pagina.CIERREDEVOLUCION), rol.CIERRE_DEVOLUCION);
        opcionRol.put(paginas.get(pagina.RETIPIFICAR), rol.RETIPIFICAR_CASO);
        opcionRol.put(paginas.get(pagina.ACTUALIZACION_DIRECCION), rol.ACTUALIZAR_DIRECCION);
        opcionRol.put(paginas.get(pagina.REGISTRO_MATERIAL), rol.REGISTRO_MATERIAL);
        opcionRol.put(paginas.get(pagina.INVENTARIO_CONSIGNADO), rol.CONSULTA_INVENTARIO);
        opcionRol.put(paginas.get(pagina.CAMBIOCLAVE), rol.CAMBIO_CLAVE);
        opcionRol.put(paginas.get(pagina.INFO_DECO), rol.INFO_DECO);
        opcionRol.put(paginas.get(pagina.PRINCIPAL), rol.PRINCIPAL);
        opcionRol.put(paginas.get(pagina.DETALLECASO), rol.DETALLE_CASO);
        opcionRol.put("SELECCIONAR_EMPRESA", rol.SELECCIONAR_EMPRESA);
        opcionRol.put(paginas.get(pagina.INVENTARIO_LIQUIDADO), rol.INVENTARIO_LIQUIDADO);
        opcionRol.put(paginas.get(pagina.DESPACHOS_MATERIAL), rol.DESPACHOS_MATERIAL);
        opcionRol.put(paginas.get(pagina.ADMINISTRACION_TECNICOS), rol.ADMINISTRACION_TECNICOS);
        opcionRol.put(paginas.get(pagina.ADMINISTRACION_LISTA_NEGRA), rol.ADMINISTRACION_LISTA_NEGRA);
        opcionRol.put(paginas.get(pagina.HISTORICO_COMENTARIOS), rol.DETALLE_CASO);
        opcionRol.put(paginas.get(pagina.INGRESAR_TECNICO), rol.ADMINISTRACION_TECNICOS);
        opcionRol.put(paginas.get(pagina.MODIFICAR_TECNICO), rol.ADMINISTRACION_TECNICOS);
    }
}
