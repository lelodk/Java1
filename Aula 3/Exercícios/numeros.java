import java.util.Scanner;
class numeros{
	public static void main(String[] args){
	
	double A;
	double B;
	double soma;
	double subt;
	double mult;
	double divi;
	double rest;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite o primeiro numero");
	A = ler.nextDouble();
	System.out.println("Digite o segundo numero");
	B = ler.nextDouble();
	
	soma = (A+B);
	subt = (A-B);
	mult = (A*B);
	divi = (A/B);
	rest = (A%B);
	
	System.out.println("Soma:"+soma);
	System.out.println("Subtração:"+subt);
	System.out.println("Multiplicação:"+mult);
	System.out.println("Divisao:"+divi);
	System.out.println("Restante:"+rest);
	
	
	
 	}
	}