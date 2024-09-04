import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ex2_Joao_Paulo_Selzler {
    
     public static void main(String[] args) {
         String nome;
         int idade;
         String genero;
         String corFavorita;
         String praticaEsporte;
         
         Scanner s = new Scanner(System.in);
         
        System.out.println("\n");
        System.out.println("Informe um nome: ");
        nome = s.next();
         
        System.out.println("\n");
        System.out.println("Informe sua idade: ");
        idade = s.nextInt();
        
        System.out.println("\n");
        System.out.println("Informe seu genero: ");
        genero = s.next();
        
        System.out.println("\n");
        System.out.println("Informe sua cor favorita: ");
        corFavorita = s.next();
         
        System.out.println("\n");
        System.out.println("Pratica esporte?: ");
        praticaEsporte = s.next();
        
        System.out.println(nome + " " + idade + " " + genero + " " + corFavorita + "   Pratica esporte?: " + praticaEsporte);
     }
}
