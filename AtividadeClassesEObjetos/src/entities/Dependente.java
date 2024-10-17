package entities;

import java.time.LocalDate;

public class Dependente extends Pessoa{
    private String grauDependente;

    Dependente(){
        super();
    }

    public Dependente(String name, LocalDate dataNascimento, String sexo, String endereco, String grauDependente) {
        super(name, dataNascimento, sexo, endereco);
        this.grauDependente = grauDependente;
    }

    public String getGrauDependente() {
        return grauDependente;
    }

    public void setGrauDependente(String grauDependente) {
        this.grauDependente = grauDependente;
    }

}
