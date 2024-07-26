public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtratoCliente() {
        System.out.println("======== EXTRATO DA CONTA POUPANCA ========");
        super.imprimirInformacoesCliente();
        System.out.println("===========================================");
    }
}
