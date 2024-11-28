package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private Integer idade;
    private Double altura;


    public static List<Usuario> listaUsuarios = new ArrayList<>();

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

    public void listarUsuario(){
        for (Usuario u : listaUsuarios){
            System.out.println(u.getNome());
        }
    }

    public void adicionarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario){
        listaUsuarios.remove(usuario);
    }

    public void escreverEmArquivo() {
        // A variável 'indice' deve ser inicializada corretamente
        int indice = 1;

        // Percorrendo a lista de usuários e criando um arquivo para cada um
        for (Usuario u : listaUsuarios) {
            // Criando o nome do arquivo com base no 'indice' e no nome do usuário
            try (BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\guilh\\IdeaProjects\\"
                            + indice
                            + "-"
                            + u.getNome().trim().toUpperCase().replace(" ", "")
                            + ".txt", true))) {
                // Escrevendo as informações no arquivo
                bw.write(u.getNome());
                bw.append(" ");
                bw.write(u.getEmail());
                bw.append(" ");
                bw.write(Integer.toString(u.getIdade()));
                bw.append(" ");
                bw.write(Double.toString(u.getAltura()));

                // Incrementando o índice para o próximo usuário
                indice++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
