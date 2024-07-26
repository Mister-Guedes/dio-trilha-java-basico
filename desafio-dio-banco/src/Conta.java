public abstract class Conta implements InterfaceConta {

    private static int AGENCIA = 1;
    private static  int NUMERO_CONTA = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA;
        this.numero = NUMERO_CONTA++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoesCliente() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome() + (" ") +this.cliente.getSobreNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCPF()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
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

}

