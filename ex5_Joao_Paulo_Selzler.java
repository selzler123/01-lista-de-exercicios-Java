import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ex5_Joao_Paulo_Selzler {
    public static void main(String[] args){ 
        
        int num1;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        num1 = s.nextInt();
        
         if (num1 % 2 == 0){
             System.out.println("O numero " + num1 + "É par. ");
         }else{
             System.out.println("O numero " + num1 + "É impar. ");
         }               
    }
}
