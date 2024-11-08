package mode.entities;

public class Invoice {
    private Double basicPayment;
    private Double tax;

    public Invoice(){

    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTotalPayment(){
        return getBasicPayment() + getTax();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fatura: \n");
        sb.append("Pagamento basico: " + getBasicPayment() + "\n");
        sb.append("Imposto: " + getTax() + "\n");
        sb.append("Pagamento total: " + getTotalPayment() + "\n");
        return sb.toString();
    }

}
