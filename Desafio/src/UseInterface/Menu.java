package UseInterface;


import entities.Usuario;
import service.ControleUsuario;
import service.Formulario;


import java.util.Scanner;

public class Menu {

    public void menu(){
        Scanner sc = new Scanner(System.in);
        Formulario formulario = new Formulario();
        ControleUsuario controleUsuario = new ControleUsuario();

        while(true){
            StringBuilder sb = new StringBuilder();
            sb.append("1 - Cadastrar o usuário\n");
            sb.append("2 - Listar todos usuários cadastrados\n");
            sb.append("3 - Cadastrar nova pergunta no formulário\n");
            sb.append("4 - Deletar pergunta do formulário\n");
            sb.append("5 - Pesquisar usuário por nome ou idade ou email");
            sb.append("0 - Sair");
            System.out.println(sb);
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1: Formulario.cadastrarUsuario();
                break;
                case 2: controleUsuario.listarUsuarios();
                break;
                case 3: formulario.adicionarPergunta();
                break;
            }

        }


    }
}
