import Entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Lista do tipo funcionario (minha classe)
        List<Funcionario> lista = new ArrayList<>();

        //Leitura dos dados

        System.out.println("Quantos funcionarios vão ser registrados ?");
        int numeroFuncionarios = sc.nextInt();

        for (int i = 0; i < numeroFuncionarios; i++) {
            sc.nextLine();
            System.out.println("Funcionario #" + (i + 1)+ ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Salary: ");
            double salario = sc.nextDouble();

            //Preciso passar a minha classe no list add
            Funcionario funcionario = new Funcionario(id, nome, salario);
            lista.add(funcionario);
        }

        System.out.println();
        System.out.print("Entre com o id do funcionario que vai receber o aumento");
        int idSalario = sc.nextInt();

        Funcionario funcionario = lista.stream().filter(f -> f.getId() == idSalario).findFirst().orElse(null);

        if(funcionario== null){
            System.out.println("Esse ID não existe.");
        } else {
            System.out.println("Entre com a porcentagem: ");
            double porcentagem = sc.nextDouble();
            funcionario.acrescimoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de Funcionarios: ");
        //Para cada funcionario na minha lista emprimir o funcionario.
        for(Funcionario x : lista){
            System.out.println(x);
        }

        sc.close();
    }

}