import java.util.Scanner;

/**
 * @author Acer
 */
public class ex1_Joao_Paulo_Selzler {
    
    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe num1: ");
        num1 = s.nextInt();
        
        System.out.println("Informe num2: ");
        num2 = s.nextInt();
        
        int result = (num1 + num2) / 2;
        
        if (result <= 60) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
        
        
    }
}
