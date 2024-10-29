package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        //Acessar o arquivo que ta nesse path
        File file = new File("C:\\Users\\guilh\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            //verificar se tem mais alguma linha
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        //tratar o erro.
        catch(IOException e){
            System.out.println("Error: "  + e.getMessage());
        }
        finally{
            //Colocar o sc.close no finally pq o recurso vai ser fechado independente se deu certo ou não
            if(sc != null){
                sc.close();
            }
        }
    }
}
