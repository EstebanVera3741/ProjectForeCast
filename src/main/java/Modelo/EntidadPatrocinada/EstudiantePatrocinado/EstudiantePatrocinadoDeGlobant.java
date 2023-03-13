package Modelo.EntidadPatrocinada.EstudiantePatrocinado;


import java.util.Date;

public class EstudiantePatrocinadoDeGlobant {

    private String nombreCompleto, tipoID;
    private long numeroIdentificacion;
    private String generacion, correoElectronico, institucion,
            ciudad, departamento;
    private Date fechaIL, fechaFL, fechaIP, fechaFP;


    public EstudiantePatrocinadoDeGlobant(String nombreCompleto, String tipoID, long numeroIdentificacion,
                                          String generacion, String correoElectronico, String institucion,
                                          String ciudad, String departamento, Date fechaIL, Date fechaFL,
                                          Date fechaIP, Date fechaFP) {

        this.nombreCompleto = nombreCompleto;
        this.tipoID = tipoID;
        this.numeroIdentificacion = numeroIdentificacion;
        this.generacion = generacion;
        this.correoElectronico = correoElectronico;
        this.institucion = institucion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.fechaIL = fechaIL;
        this.fechaFL = fechaFL;
        this.fechaIP = fechaIP;
        this.fechaFP = fechaFP;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipoID() {
        return tipoID;
    }

    public void setTipoID(String tipoID) {
        this.tipoID = tipoID;
    }

    public long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getFechaIL() {
        return fechaIL;
    }

    public void setFechaIL(Date fechaIL) {
        this.fechaIL = fechaIL;
    }

    public Date getFechaFL() {
        return fechaFL;
    }

    public void setFechaFL(Date fechaFL) {
        this.fechaFL = fechaFL;
    }

    public Date getFechaIP() {
        return fechaIP;
    }

    public void setFechaIP(Date fechaIP) {
        this.fechaIP = fechaIP;
    }

    public Date getFechaFP() {
        return fechaFP;
    }

    public void setFechaFP(Date fechaFP) {
        this.fechaFP = fechaFP;
    }

    @Override
    public String toString() {
        return "EstudiantePatrocinadoDeGlobant: " +
                "nombreCompleto: " + nombreCompleto +
                ", tipoID: " + tipoID +
                ", numeroIdentificacion: " + numeroIdentificacion +
                ", generacion: " + generacion +
                ", correoElectronico: " + correoElectronico +
                ", institucion: " + institucion +
                ", ciudad: " + ciudad +
                ", departamento: " + departamento +
                ", fechaIL: " + fechaIL +
                ", fechaFL: " + fechaFL +
                ", fechaIP: " + fechaIP +
                ", fechaFP: " + fechaFP;
    }
}
