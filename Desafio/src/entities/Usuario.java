package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private Integer idade;
    private Double altura;

    public Usuario(String nome, String email, Integer idade, Double altura) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void escreverEmArquivo(int indice){
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\guilh\\IdeaProjects\\"
                        + indice
                        + "-"
                        + getNome().trim().toUpperCase().replace(" ", "")
                        + ".txt", true))) {
            bw.write(getNome());
            bw.append(" ");
            bw.write(getEmail());
            bw.append(" ");
            bw.write(Integer.toString(getIdade()));
            bw.append(" ");
            bw.write(Double.toString(getAltura()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder br = new StringBuilder();
        br.append("Nome: ").append(getNome()).append("\n");
        br.append("Email: ").append(getEmail()).append("\n");
        br.append("Idade: ").append(getIdade()).append("\n");
        br.append("Altura: ").append(getAltura()).append("\n");
        return br.toString();
    }
}
