import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ex7_Joao_Paulo_Selzler {
   public static void main(String[] args){
      
       int num1, num2;
       
       Scanner s = new Scanner(System.in);
       
       System.out.println("Insira o numero 1: ");
       num1 = s.nextInt();
       
       System.out.println("Insira o numero 2: ");
       num2 = s.nextInt();
       
       System.out.println(num1 + " > " + num2 + ": " + (num1 > num2));
       
       System.out.println(num1 + " < " + num2 + ": " + (num1 < num2));
       
       System.out.println(num1 + " == " + num2 + ": " + (num1 == num2));
       
       System.out.println(num1 + " != " + num2 + ": " + (num1 != num2));
       
   } 
}
