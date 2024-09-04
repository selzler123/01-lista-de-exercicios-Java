import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ex4_Joao_Paulo_Selzler {
    public static void main(String[] args){ 
    
    int valor1, valor2;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Informe o primeiro valor: ");
    valor1 = s.nextInt();
    
    System.out.println("Informe o segundo valor: ");
    valor2 = s.nextInt();
    
    if (valor1 > valor2){
        System.out.println("O primeiro numero é maior que o segundo: ");
    } else if (valor1 < valor2){
        System.out.println("O primeiro valor é menor que o segundo: ");
    } else{
      System.out.println("O primeiro valor é igual ao segundo: ");
        
    }
    }
}
