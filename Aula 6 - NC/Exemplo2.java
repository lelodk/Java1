import java.util.Scanner;
class Exemplo2{
	public static void main(String[]args){
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("É necessário informar o numero desejado para efetuar a tabuada");
		System.out.println("Por favor informe o numero: ");
		x = ler.nextInt();
		
		int i = 0;
		
		while(i<=10)
		{
			System.out.println(x*i);
			i++;
		}
	}
}