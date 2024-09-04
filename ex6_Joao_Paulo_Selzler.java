import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ex6_Joao_Paulo_Selzler {
    public static void main(String[] args){
        
        int valor1;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Insira um valor inteiro: ");
        valor1 = s.nextInt();
        
        int elevado2 = valor1 * valor1;
        System.out.println("O valor elevado a 2 é: " + elevado2);
        
        int elevado4 = valor1 * valor1 * valor1 * valor1;
        System.out.println("O valor elevado a 4 é: " + elevado4);
        
        int elevado6 = valor1 * valor1 * valor1 * valor1 * valor1 * valor1;
        System.out.println("O valor elevado a 6 é: " + elevado6);
   
        int elevado8 = valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1;
        System.out.println("O valor elevado a 8 é: " + elevado8);
        
        int elevado10 = valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1;
        System.out.println("O valor elevado a 10 é: " + elevado10);
    
    
    }
}
