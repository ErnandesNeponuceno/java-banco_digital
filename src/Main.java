public class Main {
    public static void main(String[] args) {
        Cliente ernandes = new Cliente();
        ernandes.setNome("Ernandes Neponuceno");
        Conta corrente = new ContaCorrente(ernandes);

        corrente.depositar(150.20);

        Conta poupanca = new ContaCorrente(ernandes);

        corrente.transferir(14.20, poupanca);

        corrente.imprimirExtrato();

        poupanca.imprimirInfosComuns();
    }
}