import java.util.Scanner;
class Exercicio7{
	public static void main(String[]args){
		int x;
		int y;
		int n;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Informe um numero menor que 10: ");
		x = ler.nextInt();
		System.out.println("Informe um numero acima de 25: ");
		y = ler.nextInt();
		
		if (x>y)
		{
			n = x;
			x = y;
			n = y;
		}
	
for (int i = x; i<= y; i++)
System.out.println(i);		
	}
}