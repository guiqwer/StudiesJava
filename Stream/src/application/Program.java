package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        //criar stream a partir da lista
        //map aplica uma função a cada elemento da minha stream
        Stream<Integer> stream = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream.toArray()));

        //Outro meio de cirar stream
        Stream<String> stream2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(stream2.toArray()));

        //Função de iteração
        //Primeiro elemento = 0
        //Função infinita, se eu não cortar ele vai continuar somando 2, preciso de um short circuit
        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
        //short circuit no limit = 10 elementos
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));

        //Criando fibonnaci com stream
        Stream<Long> stream4 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(stream4.limit(10).toArray()));
    }
}
