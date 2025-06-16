package main;

import java.util.ArrayList;
import java.util.List;

import model.Financiamento;
import util.InterfaceUsuario;

public class App{
    public static void main(String[] args) {

         //Cria lista de financiamentos
        List<Financiamento> financiamentos = new ArrayList<>();//cria um novo financiamento
        //cria um novo usuario
        InterfaceUsuario usuario = new InterfaceUsuario();//Cria  objeto usuario vazio

        //pede valores ao usuario, atribuindo-os a variaveis
        //Financiamento 1
        System.out.println("Financiamento 1: ");
        double valorImovel1 = usuario.pedirValorImovel();
        double taxaAnual1 = usuario.pedirTaxaAnual();
        int prazoFinancEmAnos1 = usuario.pedirPrazoFinanciamentoEmAnos();
        Financiamento financiamento1 = new Financiamento(valorImovel1, prazoFinancEmAnos1, taxaAnual1);
        System.out.println("----------------------------------------------------\n");

         //Financiamento 2
        System.out.println("Financiamento 2: ");
        double valorImovel2 = usuario.pedirValorImovel();
        double taxaAnual2 = usuario.pedirTaxaAnual();
        int prazoFinancEmAnos2 = usuario.pedirPrazoFinanciamentoEmAnos();
        Financiamento financiamento2 = new Financiamento(valorImovel2, prazoFinancEmAnos2, taxaAnual2);
        System.out.println("----------------------------------------------------\n");

        //Financiamento 3
        System.out.println("Financiamento 3: ");
        double valorImovel3 = usuario.pedirValorImovel();
        double taxaAnual3 = usuario.pedirTaxaAnual();
        int prazoFinancEmAnos3 = usuario.pedirPrazoFinanciamentoEmAnos();
        Financiamento financiamento3 = new Financiamento(valorImovel3, prazoFinancEmAnos3, taxaAnual3);
        System.out.println("----------------------------------------------------\n");

        //Financiamento 4
        System.out.println("Financiamento 4: ");
        double valorImovel4 = usuario.pedirValorImovel();
        double taxaAnual4 = usuario.pedirTaxaAnual();
        int prazoFinancEmAnos4 = usuario.pedirPrazoFinanciamentoEmAnos();
        Financiamento financiamento4 = new Financiamento(valorImovel4, prazoFinancEmAnos4, taxaAnual4);
        
        //Adiciona financiamentos à lista de Financiamento

        financiamentos.add(financiamento1);
        financiamentos.add(financiamento2);
        financiamentos.add(financiamento3);
        financiamentos.add(financiamento4);
        //mostra os dados de cada financiamento para cada um na lista(Usando foreach)
       for(Financiamento financiamento: financiamentos){
                System.out.println("\nInformações do Financiamento: ");
                financiamento.mostrarDadosFinanciamento();
       }    
    }

}
