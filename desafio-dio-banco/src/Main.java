public class Main {

    public static void main(String[] args) {
        Cliente A = new Cliente();
        A.nome = "Arthur";

        Cliente B = new Cliente();
        B.nome = "Bruno";

        Conta contaCorrenteA = new ContaCorrente(A);
        Conta contaPoupancaA = new ContaPoupanca(A);

        contaCorrenteA.depositar(1000);
        contaPoupancaA.depositar(1000);


        Conta contaCorrenteB = new ContaCorrente(B);
        Conta contaPoupancaB = new ContaPoupanca(B);

        contaCorrenteB.depositar(1000);
        contaPoupancaB.depositar(1000);

        contaCorrenteA.transferir(500, contaCorrenteB);

        contaCorrenteA.imprimirExtrato();
        contaPoupancaA.imprimirExtrato();
        contaCorrenteB.imprimirExtrato();
        contaPoupancaB.imprimirExtrato();
        
    }
}
