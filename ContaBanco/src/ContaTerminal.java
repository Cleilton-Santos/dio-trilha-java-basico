import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da Agência");
        String Agencia = sc.nextLine();
        System.out.println("Digite o numero da conta!");
        int numeroConta = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha pendente após nextInt()
        System.out.println("Por favor, digite seu nome completo!");
        String nomeCliente = sc.nextLine();
        double saldo = 250.75;
        System.out.printf(
                "Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
                nomeCliente, Agencia, numeroConta, saldo);
        sc.close();
        // TODO:Conhecer e importar a classe Scanner.
        // TODO:Exibir as mensagens para o nosso usuario.
        // TODO:Obter pela scanner os valores digitados no terminal.
        // TODO:Exibir a mensaggem conta criada.
    }
}