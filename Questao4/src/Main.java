// 1. Escreva um modelo para representar uma lâmpada que está à venda em um supermercado. Que dados devem ser representados por esse modelo?
// 4. Crie uma classe em Java correspondente ao modelo criado na questão 1.
/*
Lampada:
    atributos:
        double preco;
        String tipo;
        String corLuz;
        int potencia;
        int estoque;
    metodos:
        exibirInformações;
        /acender;
        /desligar;
        /estado;
        /get e set de todos
*/
public class Main {
    public static void main(String[] args) {

        Lampada lampada = new Lampada(5.99, "led", "branca", 12, 8);
        lampada.exibirInformacoes();
        lampada.ligar();
        lampada.ligar();
        lampada.desligar();
        
    }
}