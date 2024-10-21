package program;


import entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Criando o Scanner
        Scanner sc = new Scanner(System.in);
        //Setando pra US
        Locale.setDefault(Locale.US);
        //Passando um formatter pra string do usuario
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Usar um rand pro id do Contrato
        Random rand = new Random(100);

        System.out.print("Digite o nome do Titular: ");
        String nomeTitular = sc.nextLine();
        System.out.print("Data de nascimento dd/MM/yyyy: ");
        LocalDate dataNascimento = LocalDate.parse(sc.nextLine(), formatter);
        System.out.print("Sexo Masculino/Feminino: ");
        //Poderia usar getchar
        String sexo = sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        Titular titular = new Titular(nomeTitular, dataNascimento, sexo, endereco, LocalDate.now());


        int idContrato = rand.nextInt();
        System.out.print("Digite uma data para o vencimento do contrato: ");
        LocalDate dataVencimento = LocalDate.parse(sc.nextLine(), formatter);
        LocalDate inicioContrato = LocalDate.now();
        Double percentualMulta = 10.00;
        Double jurosPorDia = 0.01;
        Contrato contrato = new Contrato(idContrato, dataVencimento, inicioContrato, percentualMulta, jurosPorDia, titular);

        System.out.println("Deseja adicionar dependente ?  S/N ");
        char escolha = sc.next().charAt(0);

        if(escolha == 'S' || escolha == 's'){
            System.out.print("Quantos dependentes?");
            int dependentes = sc.nextInt();
            sc.nextLine();

            for(int i = 1; i <= dependentes; i++){
                System.out.println("Dados do #" + i + " Dependente");
                System.out.print("Digite o nome do dependente: ");
                String nomeDependente = sc.nextLine();
                System.out.print("Data de nascimento dd/MM/yyyy: ");
                LocalDate dataDependente = LocalDate.parse(sc.nextLine(), formatter);
                System.out.print("Sexo Masculino/Feminino: ");
                String sexoDependente = sc.nextLine();
                System.out.print("Endereço: ");
                String enderecoDependente = sc.nextLine();
                System.out.print("Grau de parentesco: ");
                String grauDependente = sc.nextLine();

                //Criar o objeto dependente
                Dependente dependente = new Dependente
                        (nomeDependente,
                                dataDependente,
                                sexoDependente,
                                enderecoDependente,
                                grauDependente);

                //adicionar cada dependente na lista
                contrato.adicionarDependetes(dependente);

            }
        }

        Fatura fatura = contrato.gerarFatura();
        fatura.exibirFatura();

    }
}