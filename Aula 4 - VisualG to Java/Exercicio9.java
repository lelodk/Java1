import java.util.Scanner;
class Exercicio9{
	public static void main(String[]args){
	
	 double nota;
	 
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Informe a nota do aluno: ");
	 nota = ler.nextDouble();
	 
	 
	 if (nota> 9)
		 System.out.println("Aluno: Superior");
	 else if ((nota>= 7)&&(nota<= 8.9))
		 System.out.println("Aluno: Médio Superior");
	 else if ((nota>= 5.0)&&(nota<= 6.9))
		 System.out.println("Aluno: Médio");
	 else if ((nota>= 3.0)&&(nota<= 4.9))
		 System.out.println("Aluno; Médio Inferior");
	 else if ((nota>= 0.1)&&(nota<= 2.9))
		 System.out.println("Aluno: Inferior");
	 else if (nota== 0)
		 System.out.println("Aluno: Sem rendimento");
	
	}	
	}