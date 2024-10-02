import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados ? ");
        int n = sc.nextInt();

        Aluno[] alunos = new Aluno[n];
        for (int i = 0; i < alunos.length; i++) {
            sc.nextLine();
            System.out.printf("Digite o nome, primeira e segunda nota do %d° aluno", i + 1);
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        for (int i = 0; i < alunos.length; i++){
            double soma = alunos[i].getNota1() + alunos[i].getNota2();
            double media = soma / 2;

            if (media < 6){
                System.out.println("Aluno Reprovado\n" + alunos[i].getNome());
            } else {
                System.out.println("Aluno Aprovado\n" + alunos[i].getNome());
            }
        }

        sc.close();


    }
}