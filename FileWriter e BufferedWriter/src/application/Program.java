package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\guilh\\out.txt";

        //caso eu n queira recriar o arquivo é so passar o true como parametro no meu FileWriter
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ //aqui new FileWriter(patch, true)
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
