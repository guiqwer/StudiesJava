package application;

import model.entities.Contract;
import model.entities.Installment;
import model.entities.service.ContractService;
import model.entities.service.OnlinePaymentService;
import model.entities.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate inicioContrato = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();
        Contract contract = new Contract(number, inicioContrato, valorContrato);

        System.out.print("Entre com o número de parcelas: ");
        int parcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, parcelas);

        System.out.println("Parcelas");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment.toString());
        }

        sc.close();
    }
}
