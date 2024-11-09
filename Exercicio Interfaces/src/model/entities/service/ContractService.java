package model.entities.service;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService  {
    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double divisionValue = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            //pegar a data e ficar somando
            LocalDate dateQuota = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(divisionValue, i);
            double paymentFee = onlinePaymentService.paymentFee(divisionValue + interest);
            double quota = divisionValue + interest + paymentFee;
            contract.getInstallments().add(new Installment(dateQuota, quota));
        }
    }


}
