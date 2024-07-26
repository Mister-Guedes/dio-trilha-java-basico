public class Main {

    public static void main(String[] args) {
        Cliente Arthur = new Cliente();
        Arthur.nome = "Arthur";
    Conta cc = new ContaCorrente(Arthur);

    cc.depositar(100);

    Conta poupanca = new ContaPoupanca(Arthur);
    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
    }
}
