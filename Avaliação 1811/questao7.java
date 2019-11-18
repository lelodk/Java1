import java.util.Scanner;
class questao7{
	public static void main(String[]args){
		int x;
		int y;
		int n1,n2,n3;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o numero da conta: ");
		x = ler.nextInt();
		System.out.println("Informe o saldo da conta: R$ ");
		y = ler.nextInt();
		System.out.println("Informe o valor para débito: R$ ");
		n1 = ler.nextInt();
		System.out.println("Informe o crédito disponível na conta: R$ ");
		n2 = ler.nextInt();
		n3 = ((y-n1)+n2);
		System.out.println("Numero da conta: "+x);
		System.out.println("Saldo: R$"+n3);
		
		if (n3>0)
			System.out.println("Saldo Positivo");
		else 
			System.out.println("Saldo Negativo");
	}
}