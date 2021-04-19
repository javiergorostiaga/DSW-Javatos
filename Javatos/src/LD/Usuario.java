package LD;

public class Usuario {

    private int idUser;
    private String nomUser;
    private String empresa;
    private String localizacion;
    private String email;

    public Usuario() {
    }

    public Usuario(int idUser, String nomUser, String empresa, String localizacion, String email) {
        this.idUser = idUser;
        this.nomUser = nomUser;
        this.empresa = empresa;
        this.localizacion = localizacion;
        this.email = email;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
