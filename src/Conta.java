public abstract class Conta implements Operacoes {

    private static final int AGENCIA_PADRAO = 1001;
    private static int SEQUENCIAL = 5000;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // Construtor
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Operacoes contaDestino) {
        if (saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferir.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Numero da Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
