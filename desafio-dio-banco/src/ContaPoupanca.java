public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("======== EXTRATO DA CONTA POUPANCA ========");
        super.imprimirInfosComuns();
        System.out.println("===========================================");
    }
}
