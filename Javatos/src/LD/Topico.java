package LD;

public class Topico {

    private int idTopico;
    private String nomTopico;

    public Topico() {
    }

    public Topico(int idTopico, String nomTopico) {
        this.idTopico = idTopico;
        this.nomTopico = nomTopico;
    }

    public int getIdTopico() {
        return idTopico;
    }

    public void setIdTopico(int idTopico) {
        this.idTopico = idTopico;
    }

    public String getNomTopico() {
        return nomTopico;
    }

    public void setNomTopico(String nomTopico) {
        this.nomTopico = nomTopico;
    }
}
