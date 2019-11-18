import java.util.Scanner;
class Exercicio6{
public static void main(String[]args){

int x;
int mult=0;

Scanner ler = new Scanner(System.in);
System.out.println("Informe o numero: ");
x = ler.nextInt();

for(int i=1; i<=x ; i++){
	mult=mult+1;
	System.out.println(i+mult);
}

}
}