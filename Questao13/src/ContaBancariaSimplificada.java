public class ContaBancariaSimplificada {
    private int numConta;
    private String titular;
    private double saldo;

    public ContaBancariaSimplificada(int numConta, String titular){
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getNumConta(){
        return numConta;
    }

    public String getTitular(){
        return titular;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo+= valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso\n", valor);
        }
        else{
            System.out.println("O valor a ser depositado deve ser maior que 0.0");
        }
    }

    public boolean sacar(double valor){
        if(saldo >= valor && valor > 0){
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso\n", valor);
            return true;
        }
        else{
            System.out.println("Saldo invalido para saque");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Conta Bancaria{" +
                "número da conta=" + numConta +
                ", titular da conta='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public static boolean transfere(ContaBancariaSimplificada origem, ContaBancariaSimplificada destino, double valor) {
        if (origem.sacar(valor) == true) {
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " de " + origem.getTitular() + " para " + destino.getTitular() + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Transferência não realizada");
            return false;
        }
    }

}
