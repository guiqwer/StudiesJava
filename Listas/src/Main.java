import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List <String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Jose");
        lista.add("Ana");
        lista.add("Bob");
        lista.add("Julie");
        //Colocando alex na segunda posição 0-2
        lista.add(2, "Alex");
        //Removendo Bob da lista
        lista.remove("Bob");

        //Imprimindo tamanho da lista
        System.out.println(lista.size());
        for (String nome : lista ) {
            System.out.println(nome);
        }
        System.out.println("-------------------------------------");

        //removendo primeiro elemento da lista
        lista.remove(1 );
        //Função lambda para remover apenas quem começa com a letra M
        //Predicado
        lista.removeIf(nome -> nome.charAt(0) == 'M');

        System.out.println(lista.size());
        for (String nome : lista ) {
            System.out.println(nome);
        }

        System.out.println("-------------------------------------");
        //Posição de um elemento
        System.out.println("Posição do Alex " + lista.indexOf("Alex"));
        //Quando ele n pertence a lista o resultado é -1
        System.out.println("Bob " + lista.indexOf("Bob"));

        System.out.println("-------------------------------------");
        //Fazer uma nova lista, passar a lista original e converter para stream e filtrar com o predicado
        //Porem vou ter uma stream e não uma lista, como não são compativeis vou ter que filtrar de novo para a lista
        //Com o tolist();
        List<String> resultado = lista.stream().filter(nome -> nome.charAt(0) == 'A').toList();

        for (String nome : resultado){
            System.out.println(nome);
        }


        System.out.println("-------------------------------------");
        //Encontrar o primeiro elemento do predicado
        String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome);
    }
}