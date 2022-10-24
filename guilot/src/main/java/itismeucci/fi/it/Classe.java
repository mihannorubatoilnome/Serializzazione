package itismeucci.fi.it;

import java.util.ArrayList;
import java.util.Objects;

public class Classe {
    private int numero;
    private String sezione;
    private String aula;
    ArrayList<Alunno> List = new ArrayList<>();


    public Classe() {
    }

    public Classe(int numero, String sezione, String aula, ArrayList<Alunno> list) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        List = list;
    }
    
    public void add(Alunno a){
        List.add(a);
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return this.sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getList() {
        return this.List;
    }

    public void setList(ArrayList<Alunno> List) {
        this.List = List;
    }

    public Classe numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Classe sezione(String sezione) {
        setSezione(sezione);
        return this;
    }

    public Classe aula(String aula) {
        setAula(aula);
        return this;
    }

    public Classe List(ArrayList<Alunno> List) {
        setList(List);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Classe)) {
            return false;
        }
        Classe classe = (Classe) o;
        return numero == classe.numero && Objects.equals(sezione, classe.sezione) && Objects.equals(aula, classe.aula) && Objects.equals(List, classe.List);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, sezione, aula, List);
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", sezione='" + getSezione() + "'" +
            ", aula='" + getAula() + "'" +
            ", List='" + getList() + "'" +
            "}";
    }

}
