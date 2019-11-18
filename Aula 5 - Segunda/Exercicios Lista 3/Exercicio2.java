import java.util.Scanner;
class Exercicio2{
	public static void main(String[]args){
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("É necessário informar o numero desejado para efetuar a tabuada");
		System.out.println("Por favor informe o numero: ");
		x = ler.nextInt();
		
		for(int i=0;i<=10;i++){
			System.out.println(x*i);
		}
	}
}