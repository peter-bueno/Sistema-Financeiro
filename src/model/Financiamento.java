package model;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamentoEmAnos;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamentoEmAnos, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamentoEmAnos = prazoFinanciamentoEmAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Getters
    public double getValorImovel() {
        return this.valorImovel;
    }

    public int getPrazoFinanciamento() {
        return this.prazoFinanciamentoEmAnos;
    }

    public double getTaxaJuros() {
        return this.taxaJurosAnual;
    }

    // Cálculo da parcela mensal (Tabela Price)
    public double calcularMensalidade() {
        int quantidadeDeParcelas = this.prazoFinanciamentoEmAnos * 12; // quantidade de parcelas
        double taxaDeJurosMensal = (this.taxaJurosAnual / 100) / 12; // taxa de juros mensal

        if (taxaDeJurosMensal == 0) {
            return this.valorImovel / quantidadeDeParcelas; // Sem juros
        }
        //Onde i = taxaDeJurosMensal, n = quantidadeDeParcelas
        return this.valorImovel * (taxaDeJurosMensal * Math.pow(1 + taxaDeJurosMensal, quantidadeDeParcelas)) / (Math.pow(1 + taxaDeJurosMensal, quantidadeDeParcelas) - 1);
    }

    public double calcularTotalFinanciamento() {
        return calcularMensalidade() * prazoFinanciamentoEmAnos * 12;
    }

    public void mostrarDadosFinanciamento() {
        System.out.print("-----------------------------------------");
        System.out.printf("\nValor do imóvel: R$ %.2f\n", getValorImovel());
        System.out.printf("Prazo: %d anos\n", getPrazoFinanciamento());
        System.out.printf("Taxa anual: %.2f%%\n", getTaxaJuros());
        System.out.printf("Valor da mensalidade: R$ %.2f\n", calcularMensalidade());
        System.out.printf("Valor pago ao final do financiamento: R$ %.2f\n", calcularTotalFinanciamento());
    }
}
