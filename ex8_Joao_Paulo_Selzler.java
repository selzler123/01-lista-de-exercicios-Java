import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ex8_Joao_Paulo_Selzler {
  public static void main(String[] args){
      
      double dia1, dia30;
      
      Scanner s = new Scanner(System.in);
      
      System.out.println("Insira o valor do relogio de agua do dia 1: ");
      dia1 = s.nextDouble();
      
      System.out.println("Insira o valor do relogio de agua do dia 30: ");
      dia30 = s.nextDouble();
      
      double consumoTotal = dia30 - dia1;
      double consumoDiario = consumoTotal / 30;
      
      
      
      //Formatação da Saída Para exibir resultados com casas decimais, você deve usar double e ajustar a formatação com %.2f na impressão.
      System.out.printf("Consumo de agua total no mes: %.2f litros%n", consumoTotal);
      System.out.printf("Consumo de agua por dia: %.2f litros%n", consumoDiario);
  }
}
