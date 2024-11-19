package application;

import entities.Register;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            Map<String, Integer> votes = new HashMap<>();
            while(line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int vote = Integer.parseInt(fields[1]);
                Register register = new Register(name, vote);
                votes.put(register.getName(), votes.getOrDefault(register.getName(), 0) + register.getVote());
                line = br.readLine();
            }
            System.out.println("Election Results:");
            for (String key : votes.keySet()) {
                //pegando nome e depois o valor desse nome
                System.out.println(key + ": " + votes.get(key));
            }
        }
        catch(IOException e){
            System.out.print("Error: " + e.getMessage());
        }
    }
}
