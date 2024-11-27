package application;

import entities.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Mudar meu locale para US
        Locale.setDefault(Locale.US);
        //Declarar Scanner
        Scanner sc = new Scanner(System.in);

        //Passar a localização do meu formulario
        String path = "C:\\Users\\guilh\\IdeaProjects\\formulario.txt";

        //Declarar um try with resourcer para ler as minhas perguntas do txt
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            //usando o Stringbuilder para fazer uma única string mutavel
            StringBuilder perguntas = new StringBuilder();

            //While pra pegar as perguntas do formulário
            while(line != null){
                perguntas.append(line).append(" ");
                line = br.readLine();
            }

            String[] formulario = perguntas.toString().split(" ");

            //Passando a pergunta do nome para uma String
            String perguntaNomeCompleto = formulario[0]
                    + " "
                    + formulario[1]
                    + " "
                    + formulario[2]
                    + " "
                    + formulario[3];

            //Printando a pergunta na tela
            System.out.print(perguntaNomeCompleto);
            //Entrada usuário
            String nomeUsuario = sc.nextLine();

            //passando a pergunta do email para uma String
            String perguntaEmail = formulario[4]
                    + " "
                    + formulario[5]
                    + " "
                    + formulario[6]
                    + " "
                    + formulario[7]
                    + " "
                    + formulario[8];

            //Printando a pergunta na tela
            System.out.print(perguntaEmail);
            //Entrada usuário
            String emailUsuario = sc.nextLine();

            //Passando a pergunta da idade para uma string
            String perguntaIdade = formulario[9]
                    + " "
                    + formulario[10]
                    + " "
                    + formulario[11];

            //Printando a pergunta na tela
            System.out.print(perguntaIdade);
            //Entrada usuário
            int idadeUsuario = sc.nextInt();

            String perguntaAltura = formulario[12]
                    + " "
                    + formulario[13]
                    + " "
                    + formulario[14];

            //Printando a pergunta na tela
            System.out.print(perguntaAltura);
            //Entrada usuário
            sc.nextLine();
            double alturaUsuario = sc.nextDouble();

            //instanciando meu objeto usuário
            Usuario usuario = new Usuario(nomeUsuario, emailUsuario, idadeUsuario, alturaUsuario);

            //instanciando uma lista de usuarios
            List<Usuario> listaUsuarios = new ArrayList<>();

            //adicionando na lista o usuario
            listaUsuarios.add(usuario);
            //printando os dados do meu usuário
            System.out.print(usuario);

            for (int i = 1; i <= listaUsuarios.size(); i++) {
                usuario.escreverEmArquivo(i);
            }

        }
        //usar o catch pra pegar um possível erro de leitura
        catch(IOException e){
            System.out.print("Erro ao abrir o arquivo: " + e.getMessage());
        }

        //fechar scanner
        sc.close();
    }
}
