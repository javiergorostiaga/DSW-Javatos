package LD;

import java.util.Date;

public class Repositorio {

    private int idRepo;
    private String nomRepo;
    private String descripcion;
    private Date fechaCreacion;
    private Date ultimaActualizacion;
    private Organizacion organizacion;
    private Usuario userOwner;

    public Repositorio() {
    }

    public Repositorio(int idRepo, String nomRepo, String descripcion, Date fechaCreacion, Date ultimaActualizacion, Organizacion organizacion, Usuario userOwner) {
        this.idRepo = idRepo;
        this.nomRepo = nomRepo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.ultimaActualizacion = ultimaActualizacion;
        this.organizacion = organizacion;
        this.userOwner = userOwner;
    }

    public int getIdRepo() {
        return idRepo;
    }

    public void setIdRepo(int idRepo) {
        this.idRepo = idRepo;
    }

    public String getNomRepo() {
        return nomRepo;
    }

    public void setNomRepo(String nomRepo) {
        this.nomRepo = nomRepo;
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

    public Date getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(Date ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

    public Usuario getUserOwner() {
        return userOwner;
    }

    public void setUserOwner(Usuario userOwner) {
        this.userOwner = userOwner;
    }
}
