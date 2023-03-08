package Proyecto.Modelo.EntidadPatrocinada.EstudiantePatrocinado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EstudiantePatrocinadoDeGlobant implements FormatoTipoFecha{

    private Integer numeroIdentificacion;
    private String nombreCompleto;
    private LocalDate fechaInicioLectiva, fechaFinLectiva, fechaInicioProductiva, fechaFinProductiva;

    public EstudiantePatrocinadoDeGlobant(Integer numeroIdentificacion, String nombreCompleto,
                                          String fechaInicioLectiva, String fechaFinLectiva,
                                          String fechaInicioProductiva, String fechaFinProductiva) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombreCompleto = nombreCompleto;
        setFormatoDeFecha(fechaInicioLectiva);
        setFormatoDeFechaFinLectiva(fechaFinLectiva);
        setFormatoDeFechaInicioProductiva(fechaInicioProductiva);
        setFormatoDeFechaFinProductiva(fechaFinProductiva);
    }

    @Override
    public void setFormatoDeFecha(String formatoDeFecha) {
        try {
            fechaInicioLectiva = LocalDate.parse(formatoDeFecha);
        }catch (Exception e){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.fechaInicioLectiva = LocalDate.parse(formatoDeFecha, formatter);
        }
    }

    @Override
    public void setFormatoDeFechaFinLectiva(String formatoDeFecha) {
        try {
            fechaFinLectiva = LocalDate.parse(formatoDeFecha);
        }catch (Exception e){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.fechaFinLectiva = LocalDate.parse(formatoDeFecha, formatter);
        }
    }

    @Override
    public void setFormatoDeFechaInicioProductiva(String formatoDeFecha) {
        try {
            fechaInicioProductiva = LocalDate.parse(formatoDeFecha);
        }catch (Exception e){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.fechaInicioProductiva = LocalDate.parse(formatoDeFecha, formatter);
        }
    }

    @Override
    public void setFormatoDeFechaFinProductiva(String formatoDeFecha) {
        try {
            fechaFinProductiva = LocalDate.parse(formatoDeFecha);
        }catch (Exception e){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.fechaFinProductiva = LocalDate.parse(formatoDeFecha, formatter);
        }
    }

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaInicioLectiva() {
        return fechaInicioLectiva;
    }

    public void setFechaInicioLectiva(LocalDate fechaInicioLectiva) {
        this.fechaInicioLectiva = fechaInicioLectiva;
    }

    public LocalDate getFechaFinLectiva() {
        return fechaFinLectiva;
    }

    public void setFechaFinLectiva(LocalDate fechaFinLectiva) {
        this.fechaFinLectiva = fechaFinLectiva;
    }

    public LocalDate getFechaInicioProductiva() {
        return fechaInicioProductiva;
    }

    public void setFechaInicioProductiva(LocalDate fechaInicioProductiva) {
        this.fechaInicioProductiva = fechaInicioProductiva;
    }

    public LocalDate getFechaFinProductiva() {
        return fechaFinProductiva;
    }

    public void setFechaFinProductiva(LocalDate fechaFinProductiva) {
        this.fechaFinProductiva = fechaFinProductiva;
    }

    @Override
    public String toString() {
        return "Estudiante:" +
                " ID: " + numeroIdentificacion +
                " Nombre Completo: " + nombreCompleto +
                " Fecha Inicio Lectura: " + fechaInicioLectiva +
                " Fecha Fin Lectiva: " + fechaFinLectiva +
                " Fecha Inicio Productiva: " + fechaInicioProductiva +
                " Fecha Fin Productiva: " + fechaFinProductiva;
    }

}
