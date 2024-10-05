import java.util.Scanner;

public class Tabuada {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          // Entrada de dados; 
          int n;
          System.out.println("Qual a tabuada que você deseja visualizar?");
          n = s.nextInt();
          System.out.println("A tabuada do " + n + " é:");
          
          // Enquanto o meu contador for menor do que 10, multiplique o número que o usuario entrou pelo número do contador;
          for (int i=1; i<=10; i++){
               System.out.println(i + " x " + n + " = " + (i*n));    
          }
     }
}
