import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal{
    private static Scanner Scanner;

    public static void main(String[]args) throws Exception {
         
        //O usuário fornecerá seus dados através do terminal para criar consultar seu saldo no Banco;
        //Com acesso a esses dados iremos lhe apresentar uma mensagem;

        int numero = 0;
		String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;
		
        numero = Integer.parseInt(args[0]);
        agencia = args[1];
        nomeCliente = args[2];
        saldo = Double.parseDouble(args[3]);

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Digite o número da sua conta com 4 dígitos: ");
            numero = Scanner.nextInt();

            System.out.println(" Agora digite o número da agência: ");
            agencia = Scanner.next();

            System.out.println(" Digite seu nome completo: ");
            nomeCliente = Scanner.nextLine();

            System.out.println("Seu saldo atual é de:");
            saldo = Scanner.nextDouble();
        }

        System.out.println("Olá, " + nomeCliente + " conta: " + numero + " sua agência é: " + agencia + " e seu saldo: " + saldo + " já esta disponível para saque");

    }

    
    }

