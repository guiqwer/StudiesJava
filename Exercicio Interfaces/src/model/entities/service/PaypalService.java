package model.entities.service;

public class PaypalService implements OnlinePaymentService {

    //taxa de pagamento de 2%
    private static final double FEE_PERCENTAGE = 0.02;
    private static final double FEE_INTEREST = 0.01;


    @Override
    public double paymentFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * FEE_INTEREST * months;
    }


}
