import java.util.Scanner;
class Reajuste{
	public static void main(String[] args){
	
	double valor;
	double reajuste;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite o valor");
	valor = ler.nextDouble();
	reajuste = valor + (valor * 0.01);
	System.out.println("O valor com reajuste é:"+ reajuste);
	}
}