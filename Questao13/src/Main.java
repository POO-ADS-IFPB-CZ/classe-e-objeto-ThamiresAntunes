/*
13. Escreva uma aplicação que demonstre o uso de instâncias da classe ContaBancariaSimplificada implementada na seção  3.6.3.
Crie um método “transfere” do tipo booleano que tenha como parâmetros dois objetos do tipo Conta e o valor a ser transferido de uma conta para outra.
Esse método deverá utilizar os métodos deposita e retira da classe. O tipo booleano de retorno do método é para sinalizar se a operação de transferência
de valores foi realizada com sucesso, ou seja, se o valor a ser transferido da conta de origem for menor ou igual ao saldo dessa conta.
*/
public class Main {
    public static void main(String[] args) {

        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada(123, "Jose");
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada(345, "Maria");
        conta1.depositar(500);
        System.out.println(conta1.toString());

        ContaBancariaSimplificada.transfere(conta1, conta2, 200);
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
    }
}