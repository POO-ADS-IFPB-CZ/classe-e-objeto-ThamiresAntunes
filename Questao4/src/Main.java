// 4. Crie uma classe em Java correspondente ao modelo criado na questão 1.

public class Main {
    public static void main(String[] args) {

        Lampada lampada = new Lampada(5.99, "led", "branca", 12, 8);
        lampada.exibirInformacoes();
        lampada.ligar();
        lampada.ligar();
        lampada.desligar();

    }
}