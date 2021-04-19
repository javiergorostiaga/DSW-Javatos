package LD;

public class Commit {

    private int idCommit;
    private  String mensaje;
    private Usuario user;
    private  Repositorio repositorio;

    public Commit() {
    }

    public Commit(int idCommit, String mensaje, Usuario user, Repositorio repositorio) {
        this.idCommit = idCommit;
        this.mensaje = mensaje;
        this.user = user;
        this.repositorio = repositorio;
    }

    public int getIdCommit() {
        return idCommit;
    }

    public void setIdCommit(int idCommit) {
        this.idCommit = idCommit;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Repositorio getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }
}
