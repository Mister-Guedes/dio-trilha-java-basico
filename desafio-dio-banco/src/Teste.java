public class Teste {

    public static void main(String[] args) {
        Cliente A = new Cliente();
        A.nome = "Arthur";
        A.setSobreNome("Guedes");
        A.setCPF("123.456.789-10");

        Cliente B = new Cliente();
        B.nome = "Bruno";
        B.setSobreNome("Santos");
        B.setCPF("123.264.124-05");

        Conta contaCorrenteA = new ContaCorrente(A);
        Conta contaPoupancaA = new ContaPoupanca(A);

        contaCorrenteA.depositar(1000);
        contaPoupancaA.depositar(1000);


        Conta contaCorrenteB = new ContaCorrente(B);
        Conta contaPoupancaB = new ContaPoupanca(B);

        contaCorrenteB.depositar(1000);
        contaPoupancaB.depositar(1000);

        contaCorrenteA.transferir(500, contaCorrenteB);

        contaCorrenteA.imprimirExtratoCliente();
        contaPoupancaA.imprimirExtratoCliente();
        contaCorrenteB.imprimirExtratoCliente();
        contaPoupancaB.imprimirExtratoCliente();
        
    }
}
