public interface Operacoes {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Operacoes contaDestino);

    void imprimirExtrato();
}
