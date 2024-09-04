import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ex10_Joao_Paulo_Selzler {
    public static void main(String[] args){
   
    int numero;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Informe um número qualquer: ");
    numero = s.nextInt();
    
    if(numero > 10 && numero < 100){
          System.out.printf("numero elevado ^ a 2: %.0f", Math.pow(numero, 2));
    }else{
        System.out.printf("Raiz quadrada do numero: %.5f", Math.sqrt(numero));
    }
    System.out.println(".:Fim ");
    }  
}
