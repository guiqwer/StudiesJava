package service;

import entities.Usuario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControleUsuario {
    private List<Usuario> listaUsuarios = new ArrayList<>();

    public ControleUsuario() {

    }

    public void adicionarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }

    public void listarUsuarios() {
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
    }

    public void SalvarUsuariosEmArquivo() {
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
                System.out.println("Error:" + e.getMessage());
            }
        }
    }
}
