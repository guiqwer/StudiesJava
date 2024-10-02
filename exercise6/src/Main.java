import entities.Student;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        student.name = sc.nextLine();

        System.out.println("Entre com as 3 notas");
        student.n1 = sc.nextInt();
        student.n2 = sc.nextInt();
        student.n3 = sc.nextInt();

        System.out.println("FINAL GRADE = " + student.totalGrade());

        if (student.totalGrade() < 60){
            System.out.println("FAILED");
            System.out.println("MISSING : " + student.missingPoints() + " POINTS");
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}