package itismeucci.fi.it;

import java.util.Date;
import java.util.Objects;

public class Alunno {
    private String nome;
    private String cognome;
    private Date dataNascita;


    public Alunno() {
    }

    public Alunno(String nome, String cognome, Date dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return this.dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Alunno nome(String nome) {
        setNome(nome);
        return this;
    }

    public Alunno cognome(String cognome) {
        setCognome(cognome);
        return this;
    }

    public Alunno dataNascita(Date dataNascita) {
        setDataNascita(dataNascita);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alunno)) {
            return false;
        }
        Alunno alunno = (Alunno) o;
        return Objects.equals(nome, alunno.nome) && Objects.equals(cognome, alunno.cognome) && Objects.equals(dataNascita, alunno.dataNascita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, dataNascita);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cognome='" + getCognome() + "'" +
            ", dataNascita='" + getDataNascita() + "'" +
            "}";
    }    
}