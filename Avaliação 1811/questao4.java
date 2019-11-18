import java.util.Scanner;
class questao4{
	public static void main(String[]args){
		int x;
		int y;
		int n;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		x = ler.nextInt();
		y = (x+1);
		n = (x-1);
		 
		System.out.println("Antecessor: "+n+" Sucessor: "+y);
	}
}