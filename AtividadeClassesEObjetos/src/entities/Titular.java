package entities;

import java.time.LocalDate;

public class Titular extends Pessoa {
    private LocalDate inicioContrato;

    public Titular(){
        super();
    }


    public Titular(String name, LocalDate dataNascimento, String sexo, String endereco, LocalDate inicioContrato) {
        super(name, dataNascimento, sexo, endereco);
        this.inicioContrato = inicioContrato;
    }

    public LocalDate getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(LocalDate inicioContrato) {
        this.inicioContrato = inicioContrato;
    }
}
