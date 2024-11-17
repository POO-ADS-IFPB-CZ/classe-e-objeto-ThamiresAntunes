public class Lampada {
    //atributos
    private double preco;
    private String tipo;
    private String corLuz;
    private int potencia;
    private int estoque;
    private boolean ligada;

    //construtor inicializa todos os atributos
    public Lampada(double preco, String tipo, String corLuz, int potencia, int estoque){
        this.preco = preco;
        this.tipo = tipo;
        this.corLuz = corLuz;
        this.potencia = potencia;
        this.estoque = estoque;
        this.ligada = false;
    }
    //construtor com apenas alguns atributos para testes
    public Lampada(double preco, String tipo, int potencia){
        this.preco = preco;
        this.tipo = tipo;
        this.potencia = potencia;
        this.ligada = false;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorLuz() {
        return corLuz;
    }
    public void setCorLuz(String corLuz) {
        this.corLuz = corLuz;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    //metodos
    public void ligar(){
        if(ligada != true){
            ligada = true;
            System.out.println("Ligou");
        }
        else {
            System.out.println("Já estava ligada");
        }
    }
    public void desligar(){
        if(ligada == true){
            ligada = false;
            System.out.println("Desligou");
        }
        else {
            System.out.println("Já estava desligada");
        }
    }

    public void estadoLampada(){
        if(ligada == true){
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Preço: R$ " + preco);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cor da Luz: " + corLuz);
        System.out.println("Potência: " + potencia + " W");
        System.out.println("Quantidade em estoque: " + estoque);
        estadoLampada();
    }

}
