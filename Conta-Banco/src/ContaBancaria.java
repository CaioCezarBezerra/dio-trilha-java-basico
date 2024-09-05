import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    
     public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o número da conta:");
        conta.numero = scan.nextInt();


        System.out.println("Digite a Agência:");
        conta.agencia = scan.next();


        System.out.println("Digite o nome do cliente:");
        conta.nomeCliente = scan.next();


        System.out.println("Digite o saldo:");
        conta.saldo = scan.nextDouble();


        System.out.println(
            "Olá " + conta.nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia +
            ", conta " + conta.numero + 
            " e seu saldo " + conta.saldo + " já está disponível para saque!"
        );
        scan.close();
        scan.useDelimiter("\n");
}
}