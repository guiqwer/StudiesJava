package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        //Set<String> set = new LinkedHashSet<>();
        //Set<String> set = new HashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("Lucas Delacroix Alves do Rêgo");
        set.add("Louise Sampaio Araujo Goncalves");
        set.add("Guilherme Pereira de Souza");
        set.add("Antonio Lucas Barbosa Salvador");
        

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }



}
