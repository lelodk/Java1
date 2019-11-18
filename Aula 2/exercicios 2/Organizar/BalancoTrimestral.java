import java.util.Scanner;
class BalancoTrimestral{
	public static void main(String[] args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco	= 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediaMensal = gastosTrimestre/3;
		
		int x;		
		Scanner ler = new Scanner(System.in);
		
		System.out.println(gastosTrimestre);
		System.out.println("Valor da média mensal =" + mediaMensal);
		System.out.println("Digite um numero");
		x = ler.nextInt();
		System.out.println(x);
			}
	}