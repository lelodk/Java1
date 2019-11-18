import java.util.Scanner;
class Exercicio8{
	public static void main(String[]args){
		
		int x;
		int y;
		int n;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		x = ler.nextInt();
		System.out.println("Informe o segundo numero: ");
		y = ler.nextInt();
		
		if (x>y)
			n = x;
			x = y;
			n = y;
			
		for (int i = x ;i<=y ; i++);
		
		System.out.println(i);
	}
}