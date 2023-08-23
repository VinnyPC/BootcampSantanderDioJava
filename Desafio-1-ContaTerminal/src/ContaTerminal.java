import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int numConta;
		String agencia;
		String nomeCliente;
		Double Saldo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Conta");
		numConta = sc.nextInt();
		
		System.out.println("Por favor, digite o número da Agência");
		agencia = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Por favor, digite o nome do Cliente");
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite seu saldo");
		Saldo = sc.nextDouble();
		
		String SaldoFormatado = String.format("%.2f", Saldo);
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numConta +" e seu "
				+ "saldo é de R$"+ SaldoFormatado +" já está disponível para saque");

	}

}
