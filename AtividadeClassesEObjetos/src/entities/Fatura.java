package entities;

import java.time.LocalDate;

public class Fatura {
    private LocalDate dataVencimento;
    private double valorTotal;
    private double multa;
    private double jurosPorDia;

    public Fatura(LocalDate dataVencimento, double valorTotal, double multa, double jurosPorDia) {
        this.dataVencimento = dataVencimento;
        this.valorTotal = valorTotal;
        this.multa = multa;
        this.jurosPorDia = jurosPorDia;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void exibirFatura() {
        System.out.printf("Fatura - Vencimento: %s | Valor Total: R$ %.2f%n", dataVencimento, valorTotal);
    }


}
