import java.util.Scanner;
	class Exercicio3{
	public static void main(String[]args){
		int numero;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o numero: ");
		numero = ler.nextInt();
		
		if ((numero>=5)&&(numero<=20))
		    System.out.println("O numero encontra-se dentro do intervalo de 5 a 20");
		else
				System.out.println("Numero encontra-se fora do intervalo de 5 e 20");
				
	}
}