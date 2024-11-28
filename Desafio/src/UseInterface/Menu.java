package UseInterface;


import entities.Usuario;

import java.util.Scanner;

public class Menu {

    public void menu(){
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();

        while(true){
            StringBuilder sb = new StringBuilder();
            sb.append("1 - Cadastrar o usuário\n");
            sb.append("2 - Listar todos usuários cadastrados\n");
            sb.append("3 - Cadastrar nova pergunta no formulário\n");
            sb.append("4 - Deletar pergunta do formulário\n");
            sb.append("5 - Pesquisar usuário por nome ou idade ou email");
            System.out.println(sb);
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1: System.out.print("teste");
                case 2: usuario.listarUsuario();
                case 3:
            }

        }


    }
}
