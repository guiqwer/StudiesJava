package application;

import model.entities.Alunos;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();

        Set<Alunos> alunos = new HashSet<>();
        for(int i = 1; i <= n; i++) {
            System.out.print("Code student " + i + ": ");
            int code = sc.nextInt();
            alunos.add(new Alunos(code));
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("Code student " + i + ": ");
            int code = sc.nextInt();
            alunos.add(new Alunos(code));
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print("Code student " + i + ": ");
            int code = sc.nextInt();
            alunos.add(new Alunos(code));
        }

        System.out.println("Total students: " + alunos.size());


    }
}
