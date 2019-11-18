import java.util.Scanner;
class Exercicio8{
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
		//Informar o numero de maior valor
		if ((A>B)&&(A>C)){
			System.out.println("O valor A é o maior");
		}else if ((B>A)&&(B>C)){
				System.out.println("O valor B é o maior");
				
		}else if ((C>A)&&(C>B)){
				System.out.println("O valor C é o maior");
		}
		//Informar o numero de menor valor	
		if ((A<B)&&(A<C)){
				System.out.println("O valor menor é o A");
		}else if ((B<A)&&(B<C)){
				System.out.println("O valor menor é o B");
		}else if ((C<A)&&(C<B)){
				System.out.println("O valor menor é o C");
		}
			
	}
}