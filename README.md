## Repositório para as resoluções da Atividade (cap 3) do livro Introdução à Programação Orientada a Objetos, dos autores Batista & Moraes (pág 78 a 81);

1. Escreva um modelo para representar uma lâmpada que está à venda em um supermercado. Que dados devem ser representados por esse modelo? <br>
```
Lâmpada:
    atributos:
        double preco;
        String tipo;
        String corLuz;
        int potencia;
        int estoque;
    metodos:
        exibirInformações;
        acender;
        desligar;
        estado;
```
7. Identifique e explique o(s) erro(s) na classe abaixo:
```
1 class Registro De Eleitor
2 {
3 /**
4 * Declaração dos campos desta classe
5 */
6   int tituloDeEleitor; // número do título do eleitor
7   String nome; // nome do eleitor
8   short zonaEleitoral; // número da zona eleitoral
9 } // fim da classe
```
-> A classe acima tem um erro na criação do nome da classe ('Registro De Eleitor'), pois no nome de classes não pode ter espaços, assim como foi colocado nesta.

8. 




[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/4j22Em04)
