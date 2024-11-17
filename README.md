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
-> A classe acima tem um erro na criação do nome da classe ('Registro De Eleitor'), pois no nome de classes não pode ter espaços, assim como foi colocado nesta. Além de ter faltado os modificadores de acesso que são importantes.

8. Identifique e explique o(s) erro(s) na classe abaixo:
```
1 class Teste2
2 {
3 /**
4 * Declaração dos campos desta classe
5 */
6 int num1,num2;
7 /**
8 * Declaração dos métodos desta classe
9 */
10 int maior()
11 {
12   if (num1 > num2)
13     return true;
14   else return false;
15 }
16 void menor()
17  {
18 if (num1 < num2)
19   return num1;
20 else return num2;
21  }
22 } // fim da classe
``` 
-> A classe tem erros no retorno dos métodos, no método 'int maior()' retorna um boolean e não um int que era o retorno esperado. Já no método 'void menor()' não é esperado retorno, pois ele é 'void' e nele tem o retorno de um int.

14. Qual a importância de usar o encapsulamento na definição de classes? Exemplifique. <br>
-> O encapsulamento tem o papel de encapsular ou esconder os detalhes internos de uma classe, aqueles que não devem ser acessados/modificados diretamente, colocando níveis de acesso nos métodos e atributos no código. Com o encapsulamento é possível garantir o controle de acesso com os modificadores de acesso, a segurança ao ocultar detalhes internos, facilita a manutenção e a reutilização e permite que os detalhes complexos sejam abstraídos de quem não precisa vê-los. Com isso, o encapsulamento é um pilar muito importante da POO.


[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/4j22Em04)
