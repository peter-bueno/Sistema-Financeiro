# Trabalho de Programação Orientada a Objetos

### Aluno: Peterson Ferreira Bueno
### Disciplina: Fundamentos de Programação Orientada a Objetos
---
- Este projeto foi desenvolvido como atividade da disciplina de Introdução a Programação Orientada a Objetos (POO),
sob orientação do professor-tutor Mauricio Antonio Ferste.

## Descrição:
Sistema de simulação de financiamentos com:
- Modulazição Utilizando OOP
- Organização por pacotes/modulos
- Entrada/Saida de dados via CLI
- Validação
- Cálculo de mensalidade e total do financiamento
- Utilizando Tabela Price(Implementado por responsabilidade do aluno).
---
## Ferramentas Utilizadas: 

* Encapsulamento com atributos private e métodos public

* Construtores para inicializar objetos

* Getters para acesso controlado aos dados

* Uso de ArrayList para armazenar financiamentos

* Laços do-while para validação de entrada

* Condicionais if para verificar faixas de valores

* Entrada de dados com Scanner

* Saída de dados com System.out.print e System.out.printf

* Cálculo de mensalidade com fórmula da Tabela Price(A fórmula pega o valor que você vai financiar, aplica os juros mensalmente e distribui esse total em parcelas iguais, de modo que cada parcela já vem com um pedaço de juros + um pedaço da dívida.)

* Exibição formatada de valores monetários (ex: %.2f)

* Separação clara de responsabilidades entre as classes

* Validação de entradas do usuário (valor, prazo, taxa)

* Uso de for-each para percorrer a lista de financiamentos e imprimir resultados
---
## Estrutura dos Packages:
- main.App.java → classe principal
- model.Financiamento.java → lógica do financiamento
- util.InterfaceUsuario.java → interação com o usuário
---

[Link do Projeto](https://github.com/peter-bueno/Sistema-Financeiro.git)
### Demonstração:

##### ENTRADA:  

![Img demonstracao 1](assets/demonstracao1.png) 


##### SAIDA: 

![Img demonstracao 2](assets/demonstracao2.png) 

