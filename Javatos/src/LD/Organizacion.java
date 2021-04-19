package LD;

import java.util.Date;

public class Organizacion {

    private int idOrg;
    private String nomOrg;
    private String descripcion;
    private Date fechaCreacion;


    public Organizacion() {
    }

    public Organizacion(int idOrg, String nomOrg, String descripcion, Date fechaCreacion) {
        this.idOrg = idOrg;
        this.nomOrg = nomOrg;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(int idOrg) {
        this.idOrg = idOrg;
    }

    public String getNomOrg() {
        return nomOrg;
    }

    public void setNomOrg(String nomOrg) {
        this.nomOrg = nomOrg;
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
}
