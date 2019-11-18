import java.util.Scanner;
class questao6{
	public static void main(String[]args){
		int x;
		int i;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("******************************************************");
		System.out.println("******           Lanchonete do Bino             ******");
		System.out.println("______________________________________________________");
		System.out.println("               [1]  X - Bacon - Preço: R$ 20,00          ");
		System.out.println("               [2]  X - Salada - Preço: R$ 15,00         ");
		System.out.println("               [3]  X - Picanha - Preço: R$ 22,00        ");
		System.out.println("               [4]  X - Tudo - Preço: R$ 30,00           ");
		System.out.println("               [0]         Finalizar o Menu              ");
		System.out.println("______________________________________________________");
		System.out.println("Informe o número correspondente ao lanche desejado: ");
		x = ler.nextInt();
		
		if (x == 1)
			System.out.println("Você selecionou X-Bacon, total a pagar de R$20,00");
		else if (x == 2)
			System.out.println("Você selecionou o X-Salada, total a pagar de R$ 15,00");
		else if (x == 3)
			System.out.println("Você selecionou o X-Picanha, total a pagar de R$ 22,00");
		else if (x == 4)
			System.out.println("Você selecionou o X-Tudo, total a pagar de R$30,00");
		else if (x==0)
			System.out.println("Menu finalizado, até mais");
		else if (x>4)
			System.out.println("Numero inválido, tente novamente");
}
}