package application;


import entities.Usuario;
import java.util.Locale;


public class Program {
    public static void main(String[] args) {
        //Mudar meu locale para US
        Locale.setDefault(Locale.US);

        //Instanciando um objeto usuario com os elementos
        Usuario usuario = Usuario.preencherFormulario();

        //adicionando usuario na lista
        usuario.adicionarUsuario(usuario);

        //printando os dados do meu usuário
        System.out.print(usuario);

        //escrevendo usuario no arquivo
        usuario.escreverEmArquivo();

    }

}

