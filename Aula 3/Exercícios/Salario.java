import java.util.Scanner;
class Salario{
	public static void main(String[] args){
	
	double SM;
	double SU;
	double valor;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe seu salário:");
	SU = ler.nextDouble();
	System.out.println("Informe o salario minimo");
	SM = ler.nextDouble();
	
	valor = (SM/SU);
	

	
	System.out.println("salarios minimos: " +valor);
	
	
	}
}