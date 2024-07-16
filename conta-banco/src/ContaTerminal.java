import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--------------------Olá, seja bem vindo(a) ao nosso banco!--------------------");
        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = entrada.nextLine();

        System.out.println("Por favor, digite o número da sua Conta: ");
        int numero = entrada.nextInt();

        System.out.println("Para finalizarmos, por favor, digite seu saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        System.out.println("----------------------------------------------------------------------------------------------");
        entrada.close();
    }
}
