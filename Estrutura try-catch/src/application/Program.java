package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        method1();

        System.out.println("End of program");
    }

    public static void method1(){
        System.out.println("***METHOD 1 START***");
        method2();
        System.out.println("***METHOD 1 END***");
    }
    public static void method2(){
        System.out.println("***METHOD 2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Invalid position!");
            //imprimir na tela o rastreamento do Stack
            e.printStackTrace();
            sc.next();
        } catch(InputMismatchException e ){
            System.out.println("Invalid input!");
        }
        sc.close();
        System.out.println("***METHOD 2 END***");
    }
}