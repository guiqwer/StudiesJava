package application;


import entities.Usuario;
import service.ControleUsuario;
import service.Formulario;

import java.util.Locale;


public class Program {
    public static void main(String[] args) {
        //Mudar meu locale para US
        Locale.setDefault(Locale.US);


        //Instanciando um objeto usuario com os elementos
        Usuario usuario = Formulario.cadastrarUsuario();

        //adicionando usuario na lista
        ControleUsuario controleUsuario = new ControleUsuario();
        controleUsuario.adicionarUsuario(usuario);

        //printando os dados do meu usuário
        System.out.print(usuario);

        //escrevendo usuario no arquivo
        controleUsuario.SalvarUsuariosEmArquivo();

    }

}

