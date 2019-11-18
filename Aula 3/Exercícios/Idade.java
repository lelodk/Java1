import java.util.Scanner;
class Idade{
	public static void main(String[] args){
	int ano, mes, dia;
	int total;
	
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade em anos, meses e dias");
		
		ano = ler.nextInt();
		mes = ler.nextInt();
		dia = ler.nextInt();
		
		total = (ano*365)+(mes*30)+dia;
		System.out.println("O total de dias é:" + total);
		}
}