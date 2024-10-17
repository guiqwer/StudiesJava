package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private int idContrato ;
    private LocalDate dataVencimento;
    private LocalDate inicioContrato;
    private Double percentualMulta;
    private Double jurosPorDia;

    private List<Dependente> dependentes = new ArrayList<>();
    private Titular titular;

    public Contrato() {

    }

    public Contrato(int idContrato, LocalDate dataVencimento, LocalDate inicioContrato, Double percentualMulta, Double jurosPorDia, Titular titular) {
        this.idContrato = idContrato;
        this.dataVencimento = dataVencimento;
        this.inicioContrato = inicioContrato;
        this.percentualMulta = percentualMulta;
        this.jurosPorDia = jurosPorDia;
        this.titular = titular;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(LocalDate inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public Double getPercentualMulta() {
        return percentualMulta;
    }

    public void setPercentualMulta(Double percentualMulta) {
        this.percentualMulta = percentualMulta;
    }

    public Double getJurosPorDia() {
        return jurosPorDia;
    }

    public void setJurosPorDia(Double jurosPorDia) {
        this.jurosPorDia = jurosPorDia;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public void adicionarDependetes(Dependente dependentes){
        this.dependentes.add(dependentes);
    }

    public void removerDependentes(Dependente dependentes){
        this.dependentes.remove(dependentes);
    }


    public double calcularValorTotal() {
        double total = titular.calcularTarifa();

        for (Dependente dependente : dependentes) {
            total += dependente.calcularTarifa();
        }

        return total;
    }

    public Fatura gerarFatura() {
        double valorTotal = calcularValorTotal();
        return new Fatura(dataVencimento, valorTotal, percentualMulta, jurosPorDia);
    }


}
