import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	     System.out.println("Por favor, digite o numero da Agencia !");
	     String agencia = scanner.next();
	     
	     System.out.println("Por favor, digite o numero da Conta !");
	     int conta = scanner.nextInt();

	     System.out.println("Por favor, digite o nome do Cliente !");
	     String nomeCliente = scanner.next();

	     System.out.println("Por favor, digite o valor a sacar da sua conta!");
	     double saldo = scanner.nextDouble();
	     System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + conta + " seu saldo " + saldo + " ja esta disponivel para saque");
	
	     scanner.close();
	}

}
