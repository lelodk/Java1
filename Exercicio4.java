import java.util.Scanner;
class Exercicio4{
	public static void main(String[]args){
		int A;
		int B;
		int resultado;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		A = ler.nextInt();
		System.out.println("Informe o valor de B: ");
		B = ler.nextInt();
		
		if (A>B)
			resultado = (A+B);
		else (A<B)
				resultado = (A*B);
				
			System.out.println("O resultado é: ")
	}
}