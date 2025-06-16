package util;

import java.util.Scanner;

public class InterfaceUsuario {
    private double valorImovel;
    private int prazoFinanciamentoEmAnos;
    private double taxaAnual;
    Scanner scanner = new Scanner(System.in);

    // Método para pedir valor do imóvel, com verificação(min: 20k - max: 1b)
    public double pedirValorImovel() {
        double novoValorImovel = 0;
        do {
            System.out.print("Digite o valor do imóvel (entre 20.000 e 1.000.000.000): ");
            novoValorImovel = scanner.nextDouble();

            if (novoValorImovel < 20000 || novoValorImovel > 1000000000) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }while (novoValorImovel < 20000 || novoValorImovel > 1000000000);

        this.valorImovel = novoValorImovel;
        return novoValorImovel;
    }

    // Método para pedir prazo de financiamento, com verificação(min: 10anos - max: 70anos)
    public int pedirPrazoFinanciamentoEmAnos() {
        int novoPrazoFinanciamento = 0;
        do {
            System.out.print("Digite o prazo do financiamento em anos (entre 10 e 70): ");
            novoPrazoFinanciamento = scanner.nextInt();

            if (novoPrazoFinanciamento < 10 || novoPrazoFinanciamento > 70) {
                System.out.println("Prazo inválido! Tente novamente.");
            }
        } while (novoPrazoFinanciamento < 10 || novoPrazoFinanciamento > 70);

        this.prazoFinanciamentoEmAnos = novoPrazoFinanciamento;
        return novoPrazoFinanciamento;
    }

    // Método para pedir taxa anual, com verificação(min:1% - max:40%)
    public double pedirTaxaAnual() {
        double novaTaxaAnual = 0;
        do {
            System.out.print("Digite a taxa de juros anual (maior que 0 e até 40): ");
            novaTaxaAnual = scanner.nextDouble();

            if (novaTaxaAnual <= 0 || novaTaxaAnual > 40) {
                System.out.println("Taxa inválida! Tente novamente.");
            }
        }while (novaTaxaAnual <= 0 || novaTaxaAnual > 40);

        this.taxaAnual = novaTaxaAnual;
        return novaTaxaAnual;
    }

    // Getters
    public double getValorImovel() {
        return this.valorImovel;
    }

    public int getPrazoFinanciamento() {
        return this.prazoFinanciamentoEmAnos;
    }

    public double getTaxaJurosAnual() {
        return this.taxaAnual;
    }
    
}
