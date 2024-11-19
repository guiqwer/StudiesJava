package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        //Armazenar cookies
        Map<String, String> cookies = new TreeMap<>();

        //put = inserir (chave e valor)
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmailcom");
        cookies.put("phone", "99711122");

        //remover do meu map a cujo a chave é o email
        cookies.remove("email");
        //sobreescrever o valor
        cookies.put("phone", "99771133");

        //verificando se a chave phone existe
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        //verificando o valor que ta na chave phone
        System.out.println("Phone number: " + cookies.get("phone"));

        //verificando se existe um email na chave email
        System.out.println("Email: " + cookies.get("email"));

        //verificando tamanho do map
        System.out.println("Size: " + cookies.size());

        System.out.println("AlL COOKIES");
        //pegando os key
        for (String key : cookies.keySet()) {
            //key + a informação nessa key
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
