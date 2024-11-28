package entities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static Usuario preencherFormulario() {
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\guilh\\IdeaProjects\\formulario.txt";

        // Declarar um try-with-resources para ler as perguntas do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            // Usando o StringBuilder para fazer uma string mutável
            StringBuilder perguntas = new StringBuilder();

            // While para pegar as perguntas do formulário
            while (line != null) {
                perguntas.append(line).append(" ");
                line = br.readLine();
            }

            // Dividir o formulário em perguntas
            String[] formulario = perguntas.toString().split(" ");

            // Passando a pergunta do nome para uma String
            String perguntaNomeCompleto = formulario[0] + " " + formulario[1] + " " + formulario[2] + " " + formulario[3];
            System.out.print(perguntaNomeCompleto);
            String nomeUsuario = sc.nextLine();

            // Passando a pergunta do email para uma String
            String perguntaEmail = formulario[4] + " " + formulario[5] + " " + formulario[6] + " " + formulario[7] + " " + formulario[8];
            System.out.print(perguntaEmail);
            String emailUsuario = sc.nextLine();

            // Passando a pergunta da idade para uma String
            String perguntaIdade = formulario[9] + " " + formulario[10] + " " + formulario[11];
            System.out.print(perguntaIdade);
            int idadeUsuario = sc.nextInt();

            // Passando a pergunta da altura para uma String
            String perguntaAltura = formulario[12] + " " + formulario[13] + " " + formulario[14];
            System.out.print(perguntaAltura);
            sc.nextLine(); // limpando o buffer
            double alturaUsuario = sc.nextDouble();

            // Criar e retornar um objeto Usuario com os dados preenchidos
            return new Usuario(nomeUsuario, emailUsuario, idadeUsuario, alturaUsuario);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
