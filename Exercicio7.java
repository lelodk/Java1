import java.util.Scanner;
class Exercicio7{
	public static void main(String[]args){
		
		int A;
		int B;
		int C;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o numero A: ");
		A = ler.nextInt();
		System.out.println("Informe o numero B: ");
		B = ler.nextInt();
		System.out.println("Informe o numero C: ");
		C = ler.nextInt();
		
		if ((A<B)&&(A>C))
			System.out.println("O valor A é o do meio");
		else if ((B<A)&&(B>C))
				System.out.println("O valor B é o do meio");
				
		else if((C<A)&&(C>B))
				System.out.println("O valor C é o do meio");
	}
}