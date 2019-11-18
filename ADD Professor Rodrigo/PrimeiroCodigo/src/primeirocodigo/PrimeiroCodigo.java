package primeirocodigo;

import java.util.Scanner;


public class PrimeiroCodigo {

    
    public static void main(String[] args) {
        
             int numero;
             String nome;
       
        
       Scanner ler = new Scanner(System.in); 
       System.out.println("Informe o abençoado!");
       nome = ler.next();
       
       System.out.println("Informe o numero");
       numero = ler.nextInt();
        
  
       System.out.println("Aluno: " + nome + " " + numero);
    }
    
}
