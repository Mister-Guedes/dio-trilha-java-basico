public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtratoCliente() {
        System.out.println("======== EXTRATO DA CONTA CORRENTE ========");
        super.imprimirInformacoesCliente();
        System.out.println("===========================================");
    }
}
