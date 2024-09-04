import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ex3_Joao_Paulo_Selzler {
     public static void main(String[] args) {
         
         int valor1, valor2;
         
         Scanner s = new Scanner(System.in);
         
         System.out.println("Informe o primeiro valor: ");
         valor1 = s.nextInt();
         
         System.out.println("Informe o segundo valor:  ");
         valor2 = s.nextInt();
         
         
          int soma = valor1 + valor2;
          System.out.println("O valor da soma é: " + soma);
         
          int subtracao = valor1 - valor2;
          System.out.println("O valor da subtração é: " + subtracao);
          
          int multiplicacao = valor1 * valor2;
          System.out.println("O valor da multiplicação é: " + multiplicacao);
          
          int divisao = valor1 / valor2;
          System.out.println("O valor da divisão é: " + divisao);
     }
}
