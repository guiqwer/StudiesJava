package entities;

import java.time.LocalDate;

public class Pessoa {
    private String name;
    private LocalDate dataNascimento;
    private String sexo;
    private String endereco;

    public Pessoa() {
    }

    public Pessoa(String name, LocalDate dataNascimento, String sexo, String endereco) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double calcularTarifa() {
        int idade = getDataNascimento().getYear() - LocalDate.now().getYear();
        double tarifaBase = sexo.equalsIgnoreCase("Masculino") ? 200.0 : 180.0;

        if (idade <= 18) tarifaBase *= 0.8; // Desconto de 20%
        else if (idade >= 60) tarifaBase *= 1.5; // Aumento de 50%

        return tarifaBase;
    }
}
