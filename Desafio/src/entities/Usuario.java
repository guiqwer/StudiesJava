package entities;

import java.io.*;
import java.util.*;

public class Usuario {
    private String nome;
    private String email;
    private Integer idade;
    private Double altura;

    public Usuario(){

    }

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



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(getNome()).append("\n");
        sb.append("Email: ").append(getEmail()).append("\n");
        sb.append("Idade: ").append(getIdade()).append("\n");
        sb.append("Altura: ").append(getAltura()).append("\n");
        return sb.toString();
    }
}
