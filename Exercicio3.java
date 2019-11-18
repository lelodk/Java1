import java.util.Scanner;
class Exercicio3{
	public static void main(String[]args){
	
	int numero;
	for(int i = 1 ; i<=10; i++){
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe 10 numeros");
	numero = ler.nextInt();
	
	if(numero %2 ==0)
			System.out.println(numero + "É par");
	else	System.out.println(numero + "É impar");
	}
	}
}