package service;

import entities.Usuario;

import java.io.*;
import java.util.*;

public class Formulario {

    public Formulario(){

    }

    public static Usuario cadastrarUsuario() {
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\guilh\\IdeaProjects\\formulario.txt";

        // Declarar um try-with-resources para ler as perguntas do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            List<String> perguntas = new ArrayList<>();

            // While para pegar as perguntas do formulário
            while (line != null) {
                perguntas.add(line);
                line = br.readLine();
            }

            //map para associar cada pergunta com uma resposta
            Map<String, String> respostas = new LinkedHashMap<>();

            for (String pergunta : perguntas) {
                System.out.println(pergunta + " ");
                String resposta = sc.nextLine();
                respostas.put(pergunta, resposta);
            }

            String nome = respostas.get(perguntas.get(0));  // Resposta para o nome
            String email = respostas.get(perguntas.get(1));  // Resposta para o email
            int idade = Integer.parseInt(respostas.get(perguntas.get(2)));  // Resposta para a idade
            double altura = Double.parseDouble(respostas.get(perguntas.get(3)));  // Resposta para a altura

            return new Usuario(nome, email, idade, altura);

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
            return null;
        }
    }

    public void adicionarPergunta(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a pergunta para ser adicionada ao formulario.");
        String pergunta = sc.nextLine();


        String path = "C:\\Users\\guilh\\IdeaProjects\\formulario.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            bw.write(pergunta);
            bw.newLine();
            System.out.println("Pergunta adicionada com sucesso!");
        } catch (IOException e){
            System.out.println("Error:" + e.getMessage());
        }

    }

}
