package LD;

import com.sun.javafx.binding.StringFormatter;

import java.util.Date;

public class Equipo {

    private  int idEquipo;
    private String nomEquipo;
    private String descripcion;
    private Date fechaCreacion;
    private Organizacion organizacion;

    public Equipo() {
    }

    public Equipo(int idEquipo, String nomEquipo, String descripcion, Date fechaCreacion, Organizacion organizacion) {
        this.idEquipo = idEquipo;
        this.nomEquipo = nomEquipo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.organizacion = organizacion;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNomEquipo() {
        return nomEquipo;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }
}
