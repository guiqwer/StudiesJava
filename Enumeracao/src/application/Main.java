package application;

import entities.enums.OrderStatus;
import entities.enums.Pedido;
import java.util.Date;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //declarar objeto classe pedido
        Pedido order = new Pedido(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);

        System.out.println(order);

        // Conversão de String para enum

        OrderStatus os1 = OrderStatus.ENTREGUE;

        //Passando string diretamente pro enum
        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);
    }
}