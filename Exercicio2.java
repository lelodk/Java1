import java.util.Scanner;
	class Exercicio2{
	public static void main(String[]args){
		int numero1;
		int numero2;
		int resultado;
		
		Scanner ler = new Scanner(System.in);
			System.out.println("Informe o primeiro numero: ");
			numero1 = ler.nextInt();
			System.out.println("Informe o segundo numero: ");
			numero2 = ler.nextInt();
			
			
			if (numero1 > numero2)
			resultado =	(numero1 - numero2);
		else
			resultado = (numero2 - numero1);
		
			System.out.println("Sobra: "+ resultado);
	}
}