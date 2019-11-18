import java.util.Scanner;
class MediaAluno{
	public static void main(String[] args){
		
		double nota1;
		double nota2;
		double nota3;
		double media;
		int faltas = 20;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a nota1");
		nota1 = ler.nextDouble();
		System.out.println("Digite a nota2");
		nota2 = ler.nextDouble();
		System.out.println("Digite a nota3");
		nota3 = ler.nextDouble();
		System.out.println("Numero de Faltas");
		ler.nextInt();
		
		media= (nota1+nota2+nota3)/3;
		System.out.println(media);
		
		if(media>=6 && faltas<20)
		System.out.println("Aprovado");
		else
		System.out.println("Reprovado");
		
		
		
		
		
		}
		}